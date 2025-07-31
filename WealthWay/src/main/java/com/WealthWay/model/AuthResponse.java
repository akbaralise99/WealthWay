package com.WealthWay.model;
public class AuthResponse {
    private String token;
    private String username;
	public String getToken() {
		return token;
	}
	public String getUsername() {
		return username;
	}
	public AuthResponse(String token, String username) {
		super();
		this.token = token;
		this.username = username;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
