package com.WealthWay.ServiceImpl;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WealthWay.Repository.UserAuthControllerRepository;
import com.WealthWay.Services.UserAuthControllerService;
import com.WealthWay.model.AuthResponse;
import com.WealthWay.model.LoginRequest;
import com.WealthWay.model.RegisterRequest;
import com.WealthWay.model.Entity.User;

@Service
public class UserAuthControllerServiceImpl implements UserAuthControllerService {

    @Autowired private UserAuthControllerRepository userRepository;
    User user;
    public AuthResponse register(RegisterRequest req) {
    	
        user = userRepository.findByEmail(req.getEmail());
        if(user!=null) {
        	throw new RuntimeException("User already Registerd with email");
        }
        user.setName(req.getName());
        user.setEmail(req.getEmail());
        user.setPassword(req.getPassword());
        long timestamp = System.currentTimeMillis(); // 13 digits
        int randomSuffix = ThreadLocalRandom.current().nextInt(100, 999); // 3 digits

        long userId = Long.parseLong(timestamp + "" + randomSuffix);
        user.setUserId(userId);
        user.setRole("USER");
      
        userRepository.save(user);
        String token =user.getName();
        return new AuthResponse(token, user.getUserId());
    }

    public AuthResponse login(LoginRequest req) {
        User user = userRepository.findByEmail(req.getEmail());
        if(user==null)
             throw new RuntimeException("User not found");
        
        if (!req.getPassword().equals( user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }
        String token =user.getName();
        return new AuthResponse(token, user.getUserId());
    }
    
//    public String generateToken(User user) {
//        return Jwts.builder()
//                .setSubject(user.getEmail())
//                .claim("role", user.getRole())
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
//                .compact();
//    }
}

