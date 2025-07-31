package com.WealthWay.Services;

import com.WealthWay.model.LoginRequest;
import com.WealthWay.model.RegisterRequest;

public interface UserAuthControllerService {

	Object register(RegisterRequest request);

	Object login(LoginRequest request);

}
