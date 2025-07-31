package com.WealthWay.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.WealthWay.model.Entity.User;
@Repository
public interface UserAuthControllerRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	User findByUserId(Long userId);

}
