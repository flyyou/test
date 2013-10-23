package com.seoksik.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.seoksik.test.manager.UserManager;
import com.seoksik.test.model.GetUserProfileRequest;
import com.seoksik.test.model.GetUserProfileResponse;
import com.seoksik.test.model.RegisterUserRequest;
import com.seoksik.test.model.RegisterUserResponse;
import com.seoksik.test.model.UpdateUserProfileRequest;
import com.seoksik.test.model.UpdateUserProfileResponse;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserManager userManager;

	public RegisterUserResponse registerUser(RegisterUserRequest request) {
		RegisterUserResponse response = new RegisterUserResponse();

		return response;
	}

	public GetUserProfileResponse getUserProfile(GetUserProfileRequest request) {
		GetUserProfileResponse response = new GetUserProfileResponse();
		response.setTimestamp(System.currentTimeMillis());
		response.setName("foo");
		response.setStatus("active");
		response.setBirthday("01-21");
		response.setEmail("woozoo73@gmail.com");
		response.setSamsungemail("woozoo73@gmail.com");

		return response;
	}

	public UpdateUserProfileResponse updateUserProfile(UpdateUserProfileRequest request) {
		UpdateUserProfileResponse response = new UpdateUserProfileResponse();

		return response;
	}

}
