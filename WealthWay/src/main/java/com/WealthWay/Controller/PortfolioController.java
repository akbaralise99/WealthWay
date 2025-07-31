package com.WealthWay.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WealthWay.Services.PortfolioService;
import com.WealthWay.model.PortfolioDTO;
import com.WealthWay.model.Entity.portfolio;

@RestController
@RequestMapping("/api/portfolio")
public class PortfolioController {
 
	
	   @Autowired
	    private PortfolioService portfolioService;

	    @PostMapping("/add")
	    public ResponseEntity<PortfolioDTO> addPortfolio(@RequestBody PortfolioDTO portfolioDto) {
	        return ResponseEntity.ok(portfolioService.addPortfolio(portfolioDto));
	    }

	    @GetMapping("/user/{userId}")
	    public ResponseEntity<List<portfolio>> getUserPortfolio(@PathVariable Long userId) {
	    	
	    	List<portfolio>	data  =portfolioService.getPortfoliosByUserId(userId);
	    	System.out.println("grtting data "+data)	 ;
	    	return ResponseEntity.ok(data);
	    }
	
	
}
