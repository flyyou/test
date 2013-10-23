package com.seoksik.test.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jra.Get;
import org.codehaus.jra.HttpResource;
import org.codehaus.jra.Post;

import com.seoksik.test.model.GetUserProfileRequest;
import com.seoksik.test.model.GetUserProfileResponse;
import com.seoksik.test.model.RegisterUserRequest;
import com.seoksik.test.model.RegisterUserResponse;
import com.seoksik.test.model.UpdateUserProfileRequest;
import com.seoksik.test.model.UpdateUserProfileResponse;

/**
 * 사용자 Service.
 * 
 * @author woozoo73
 */
@WebService
public interface UserService {

	/**
	 * 사용자를 등록한다.
	 * 
	 * @param request
	 *            사용자 등록 요청.
	 * @return 사용자 등록 응답.
	 */
	@Post
	@HttpResource(location = "/reg")
	@WebResult(name = "result")
	RegisterUserResponse registerUser(@WebParam(name = "param") RegisterUserRequest request);

	/**
	 * 사용자를 조회한다.
	 * 
	 * @param request
	 *            사용자 프로필 요청.
	 * @return 사용자 프로필 응답.
	 */
	@Get
	@HttpResource(location = "/profile")
	@WebResult(name = "result")
	GetUserProfileResponse getUserProfile(@WebParam(name = "param") GetUserProfileRequest request);

	/**
	 * 사용자 프로필을 바꾼다.
	 * 
	 * @param request
	 *            사용자 프로필 변경 요청.
	 * @return 사용자 프로필 변경 응답.
	 */
	@Post
	@HttpResource(location = "/profile")
	@WebResult(name = "result")
	UpdateUserProfileResponse updateUserProfile(@WebParam(name = "param") UpdateUserProfileRequest request);

}
