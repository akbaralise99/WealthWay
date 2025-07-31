package com.WealthWay.ServiceImpl;
import java.util.List;
import java.util.stream.Collectors;

import javax.sound.sampled.Port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WealthWay.Repository.PortfolioRepository;
import com.WealthWay.Services.PortfolioService;
import com.WealthWay.model.PortfolioDTO;
import com.WealthWay.model.Entity.portfolio;
@Service
public class PortfolioServiceImpl implements PortfolioService{
	
	 @Autowired
	    private PortfolioRepository portfolioRepository;

	    @Override
	    public PortfolioDTO addPortfolio(PortfolioDTO portfolioDto) {
	    	portfolio portfolio = new portfolio();
	        portfolio.setUserId(portfolioDto.getUserId());
	        portfolio.setInvestmentType(portfolioDto.getInvestmentType());
	        portfolio.setAmount(portfolioDto.getInvestedAmount());
	        portfolio.setGoal(portfolioDto.getGoalName());
	        portfolio saved = portfolioRepository.save(portfolio);
	        portfolioDto.setId(saved.getId());
	        return portfolioDto;
	    }

	    @Override
	    public List<portfolio> getPortfoliosByUserId(Long userId) {
	        return portfolioRepository.findByUserId(userId).stream().map(p -> {
	        	portfolio dto = new portfolio();
	            dto.setId(p.getId());
	            dto.setUserId(p.getUserId());
	            dto.setInvestmentType(p.getInvestmentType());
	            dto.setAmount(p.getAmount());
	            dto.setGoal(p.getGoal());
	            return dto;
	        }).collect(Collectors.toList());
	    }
}
