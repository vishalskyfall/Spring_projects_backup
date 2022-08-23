package com.Login_Reg.SecurityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.Login_Reg.security.CustomAuthenticationProvider;
import com.Login_Reg.security.CustomUserDetailsService;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsService service;
	
	@Autowired
	private CustomAuthenticationProvider authenticationProvider;
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeRequests()
				// .antMatchers("/user/**").authenticated()
				// .antMatchers("/admin/**").denyAll()
				.antMatchers("/registerUser","/login").permitAll()
				.antMatchers("/dashboard").hasRole("ADMIN")
				.antMatchers("/profile").hasAnyRole("ADMIN","USER")
				.anyRequest().authenticated().and()
				// .formLogin()
				// .and()
				.httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(service).passwordEncoder(passwordEncoder());
		
		//now customauth
		auth.authenticationProvider(authenticationProvider);
	}

	@Bean
	public static PasswordEncoder passwordEncoder() {
		// return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}
}
