package com.Login_Reg.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/home")
	public String adminHome() {
		return "Admin Home";
	}

	@GetMapping("/admindashboard") // protected Endpoint
	public String admindashboard() {
		return "Welcome to our admin side !";
	}
}
