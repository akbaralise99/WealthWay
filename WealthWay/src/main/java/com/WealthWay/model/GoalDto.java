package com.WealthWay.model;
public class GoalDto {
   
	private Long userId;
	private String goalName;
    private double targetAmount;
    private int yearsToAchieve;
    private double currentInvestment;
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
	
    
    public String getGoalName() {
		return goalName;
	}
	public double getTargetAmount() {
		return targetAmount;
	}
	public int getYearsToAchieve() {
		return yearsToAchieve;
	}
	public double getCurrentInvestment() {
		return currentInvestment;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	public void setTargetAmount(double targetAmount) {
		this.targetAmount = targetAmount;
	}
	public void setYearsToAchieve(int yearsToAchieve) {
		this.yearsToAchieve = yearsToAchieve;
	}
	public void setCurrentInvestment(double currentInvestment) {
		this.currentInvestment = currentInvestment;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
