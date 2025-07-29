package com.WealthWay.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@JsonIgnoreProperties(ignoreUnknown = true)
public class PortfolioDTO {

    private Long id;
    private Long portfolioId;
    private Long userId;

    private String investmentType;
    private String schemeName;
    private String symbol;

    private double investedAmount;
    private double currentValue;
    private double profitOrLoss;
    private double returnPercentage;

    private String goalName;
    private LocalDate goalTargetDate;
    private double goalTargetAmount;

    private LocalDate investmentDate;
    private String status;

    private boolean sip; // ✔ fixed isSIP => sip
    private double sipAmount;
    private String sipFrequency;

    private String lastUpdatedBy;
    private LocalDateTime lastUpdatedDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getInvestmentType() {
		return investmentType;
	}
	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getInvestedAmount() {
		return investedAmount;
	}
	public void setInvestedAmount(double investedAmount) {
		this.investedAmount = investedAmount;
	}
	public double getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}
	public double getProfitOrLoss() {
		return profitOrLoss;
	}
	public void setProfitOrLoss(double profitOrLoss) {
		this.profitOrLoss = profitOrLoss;
	}
	public double getReturnPercentage() {
		return returnPercentage;
	}
	public void setReturnPercentage(double returnPercentage) {
		this.returnPercentage = returnPercentage;
	}
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	public LocalDate getGoalTargetDate() {
		return goalTargetDate;
	}
	public void setGoalTargetDate(LocalDate goalTargetDate) {
		this.goalTargetDate = goalTargetDate;
	}
	public double getGoalTargetAmount() {
		return goalTargetAmount;
	}
	public void setGoalTargetAmount(double goalTargetAmount) {
		this.goalTargetAmount = goalTargetAmount;
	}
	public LocalDate getInvestmentDate() {
		return investmentDate;
	}
	public void setInvestmentDate(LocalDate investmentDate) {
		this.investmentDate = investmentDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isSip() {
		return sip;
	}
	public void setSip(boolean sip) {
		this.sip = sip;
	}
	public double getSipAmount() {
		return sipAmount;
	}
	public void setSipAmount(double sipAmount) {
		this.sipAmount = sipAmount;
	}
	public String getSipFrequency() {
		return sipFrequency;
	}
	public void setSipFrequency(String sipFrequency) {
		this.sipFrequency = sipFrequency;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
}






