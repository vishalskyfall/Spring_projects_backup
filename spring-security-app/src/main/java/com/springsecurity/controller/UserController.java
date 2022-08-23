package com.springsecurity.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.common.UserConstant;
import com.springsecurity.entity.User;
import com.springsecurity.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	

	@Autowired
	private UserRepository repository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@PostMapping("/join")
	public String joinGroup(@RequestBody User user) {
		user.setRoles(UserConstant.DEFAULT_ROLE);
		String encrypted_pswd = encoder.encode(user.getPassword());
		user.setPassword(encrypted_pswd);
		repository.save(user);
		return "Hi " + user.getUserName() + " welcome to group . . .";
	}

	// If logged in user is ADMIN -> ADMIN OR MODERATOR access he can give
	// If logged in user is MODERATOR -> MODERATOR only access he can give

//	check difference between preauthorize and secured
	@GetMapping("/access/{userId}/{userRole}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_MODERATOR')")
	public String giveAccesstoUser(@PathVariable int userId, @PathVariable String userRole,
		 Principal principal) {

		User user = repository.findById(userId).get();
		List<String> activeRoles = getRolesByLoggedInUser(principal);
		String newRole = "";
		if (activeRoles.contains(userRole)) {
			newRole = user.getRoles() + " , " + userRole;
			user.setRoles(newRole);
		}
		repository.save(user);
		return "Hi " + user.getUserName() + " new Role assigned to you by " + principal.getName();

	}

	@GetMapping
	@Secured("ROLE_ADMIN")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<User> loadUsers() {
		return repository.findAll();
	}

	@GetMapping("/test")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String testAccess() {
		return "user can only access this!";
	}

	private List<String> getRolesByLoggedInUser(Principal principal) {
		String roles = getLoggedInUser(principal).getRoles();
		List<String> assignRoles = Arrays.stream(roles.split(",")).collect(Collectors.toList());
		if (assignRoles.contains("ROLE_ADMIN")) {
			return Arrays.stream(UserConstant.ADMIN_ACCESS).collect(Collectors.toList());
		}
		if (assignRoles.contains("ROLE_MODERATOR")) {
			return Arrays.stream(UserConstant.MODERATOR_ACCESS).collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	private User getLoggedInUser(Principal principal) {
		return repository.findByUserName(principal.getName()).get();
	}
}
