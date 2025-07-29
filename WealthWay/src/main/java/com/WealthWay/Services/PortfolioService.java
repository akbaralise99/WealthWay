package com.WealthWay.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.WealthWay.model.PortfolioDTO;
import com.WealthWay.model.portfolio;

@Service
public interface PortfolioService {
	
	PortfolioDTO addPortfolio(PortfolioDTO portfolioDto);
	List<portfolio> getPortfoliosByUserId(Long userId);

}
