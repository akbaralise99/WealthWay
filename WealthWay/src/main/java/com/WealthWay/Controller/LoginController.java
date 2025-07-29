package com.WealthWay.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/loginApi")

public class LoginController {
	
	@GetMapping("/loginId/{id}")
	public String login(@PathVariable  int id) {
		
		return "Succesfully login"+id;
		
	}

}
