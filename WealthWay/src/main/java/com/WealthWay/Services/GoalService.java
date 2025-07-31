package com.WealthWay.Services;

import com.WealthWay.model.GoalDto;

public interface GoalService {
	public double calculateRequiredSIP(GoalDto goalDto);
	public double calculateFutureValue(double monthlyInvestment, int years);

}
