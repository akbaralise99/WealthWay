package com.WealthWay.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WealthWay.Repository.GoalRepository;
import com.WealthWay.Repository.UserAuthControllerRepository;
import com.WealthWay.Services.GoalService;
import com.WealthWay.model.GoalDto;
import com.WealthWay.model.Entity.Goal;
import com.WealthWay.model.Entity.User;

@Service
public class GoalServiceImpl implements GoalService {
	
	@Autowired private GoalRepository goals;
	@Autowired private UserAuthControllerRepository userAuthRepo;
	
	//later will add searched goals and show user for 10 Goal searches after every 15 days in notifaction 

    // Future Value formula: FV = P * [ (1 + r)^n – 1 ] / r
    public double calculateRequiredSIP(GoalDto goalDto) {
        double fv = goalDto.getTargetAmount();
        double r = 0.12 / 12; // assume 12% annual return, monthly
        int n = goalDto.getYearsToAchieve() * 12;

        double sip = fv * r / (Math.pow(1 + r, n) - 1);
        
        Goal goal = new Goal();
         goal.setCurrentInvestment(goalDto.getCurrentInvestment());
         goal.setGoalName(goalDto.getGoalName());
         goal.setTargetAmount(goalDto.getTargetAmount());
         goal.setYearsToAchieve(goalDto.getYearsToAchieve());
         goal.setSipAmountRequired(sip);
         
         User user=userAuthRepo.findByUserId(goalDto.getUserId());
        goal.setUser(user);
        goals.save(goal);
        return sip;
    }

    public double calculateFutureValue(double monthlyInvestment, int years) {
        double r = 0.12 / 12;
        int n = years * 12;
        return monthlyInvestment * (Math.pow(1 + r, n) - 1) / r;
    }
}
