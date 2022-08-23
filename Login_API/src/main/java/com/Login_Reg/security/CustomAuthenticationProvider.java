package com.Login_Reg.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.Login_Reg.entity.Role;
import com.Login_Reg.entity.User;
import com.Login_Reg.repository.UserRepository;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PasswordEncoder encoder;
	/*
	 * //@Autowired public CustomAuthenticationProvider(PasswordEncoder encoder) {
	 * this.encoder = encoder; }
	 */
	
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String email = authentication.getName();
		String password = authentication.getCredentials().toString();
		System.out.println(password);
		
		User user = repository.findByEmail(email).orElseThrow(()->
		new UsernameNotFoundException("User not found"));
		
		if(encoder.matches(password, user.getPassword())) {
			return new UsernamePasswordAuthenticationToken(email, password, getRoles(user.getRoles()));
		}else {
			throw new BadCredentialsException("Wrong Creds!");
		}
	}

	private Set<SimpleGrantedAuthority> getRoles(Set<Role> roles) {
		Set<SimpleGrantedAuthority> list = new HashSet<SimpleGrantedAuthority>();
		for(Role auth : roles ) {
			list.add(new SimpleGrantedAuthority(auth.getRole()));
		}
		return list;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
