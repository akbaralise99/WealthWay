package com.WealthWay.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/signupApi")
public class SignUpController {
	
	@PostMapping()
	public String signUp(@PathVariable  int id) {
		
		return "Succesfully login"+id;
		
	}

}
