package com.WealthWay.model.Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "goal")
public class Goal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String goalName;         // e.g., "Child Education"
    private double targetAmount;     // e.g., ₹25,00,000
    private int yearsToAchieve;      // e.g., 15
    private double currentInvestment;// optional
    private double sipAmountRequired;

    @ManyToOne
    private User user;

	public Long getId() {
		return id;
	}

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

	public User getUser() {
		return user;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setUser(User user) {
		this.user = user;
	}

	public double getSipAmountRequired() {
		return sipAmountRequired;
	}

	public void setSipAmountRequired(double sipAmountRequired) {
		this.sipAmountRequired = sipAmountRequired;
	}

	
}
