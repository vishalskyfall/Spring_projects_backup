package com.Login_Reg.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Login_Reg.entity.Role;
import com.Login_Reg.entity.User;
import com.Login_Reg.model.UserModel;
import com.Login_Reg.repository.UserRepository;

@CrossOrigin("http://localhost:3000/")
@RestController
//@RequestMapping("/user")
public class HomeController {

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private UserRepository repository;

	@Autowired
	private AuthenticationManager manager;

	@PostMapping("/registerUser") // public Endpoint
	public User register(@RequestBody UserModel model) {
//		return "You're on the home";
		User newU = new User();
		newU.setName(model.getName());
		newU.setAddress(model.getAddress());
		newU.setEmail(model.getEmail());
		newU.setPassword(encoder.encode(model.getPassword()));

		// adding role everytime
		Set<Role> hash_Set = new HashSet<Role>();
		Role role = new Role();
		role.setRole("ROLE_USER");
		hash_Set.add(role);
		newU.setRoles(hash_Set);

		return repository.save(newU);
	}

	@PostMapping("/login")
	public ResponseEntity<HttpStatus> login(@RequestBody UserModel userModel) throws Exception {
		Authentication authentication;
		try {
			authentication = manager.authenticate(
					new UsernamePasswordAuthenticationToken(userModel.getEmail(), userModel.getPassword()));
			SecurityContextHolder.getContext().setAuthentication(authentication);
		} catch (BadCredentialsException e) {
			throw new Exception("Invalid Credentials !");
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@GetMapping("/dashboard") // protected Endpoint
	public String dashboard() {
		return "Welcome to our application !";
	}
}
