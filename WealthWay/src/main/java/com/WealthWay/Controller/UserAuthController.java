package com.WealthWay.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WealthWay.Services.UserAuthControllerService;
import com.WealthWay.model.LoginRequest;
import com.WealthWay.model.RegisterRequest;

@RestController("api/portfolio")
public class UserAuthController {
	
	@Autowired private UserAuthControllerService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
		
	

}
