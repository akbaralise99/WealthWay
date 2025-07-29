package com.WealthWay.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.WealthWay.model.PortfolioDTO;
import com.WealthWay.model.portfolio;

@Repository
public interface PortfolioRepository  extends CrudRepository<portfolio, Long>{
	 List<portfolio> findByUserId(Long userId);

}
