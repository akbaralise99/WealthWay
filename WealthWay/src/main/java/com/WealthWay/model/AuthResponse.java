package com.WealthWay.model;
public class AuthResponse {
    private String token;
    private long userId;
	
    public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getToken() {
		return token;
	}
	
	public AuthResponse(String token, long userId) {
		super();
		this.token = token;
		this.userId = userId;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
