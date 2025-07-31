package com.WealthWay.ServiceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.WealthWay.Repository.UserAuthControllerRepository;
import com.WealthWay.Services.UserAuthControllerService;
import com.WealthWay.model.AuthResponse;
import com.WealthWay.model.LoginRequest;
import com.WealthWay.model.RegisterRequest;
import com.WealthWay.model.Entity.User;

import io.jsonwebtoken.Jwts;

@Service
public class UserAuthControllerServiceImpl implements UserAuthControllerService {

    @Autowired private UserAuthControllerRepository userRepository;

    public AuthResponse register(RegisterRequest req) {
        User user = new User();
        user.setName(req.getName());
        user.setEmail(req.getEmail());
        user.setPassword(req.getPassword());
        user.setRole("USER");
        userRepository.save(user);
        String token = generateToken(user);
        return new AuthResponse(token, user.getName());
    }

    public AuthResponse login(LoginRequest req) {
        User user = userRepository.findByEmail(req.getEmail());
        if(user==null)
             throw new RuntimeException("User not found");
        
        if (!req.getPassword().equals( user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }
        String token =generateToken(user);
        return new AuthResponse(token, user.getName());
    }
    
    public String generateToken(User user) {
        return Jwts.builder()
                .setSubject(user.getEmail())
                .claim("role", user.getRole())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .compact();
    }
}

