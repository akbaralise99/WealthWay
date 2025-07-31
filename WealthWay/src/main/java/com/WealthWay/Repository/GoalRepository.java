package com.WealthWay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WealthWay.model.Entity.Goal;

public interface GoalRepository  extends JpaRepository<Goal, Long>{

}
