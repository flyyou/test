package com.seoksik.test.manager;

import com.seoksik.test.entity.User;

/**
 * 사용자 Manager.
 * 
 * @author woozoo73
 */
public interface UserManager {

	/**
	 * 사용자를 등록한다.
	 * 
	 * @param user
	 *            등록할 사용자.
	 * @return 생성된 uid.
	 */
	String register(User user);

	/**
	 * 사용자를 조회한다.
	 * 
	 * @param uid
	 *            조회할 uid.
	 * @return uid에 해당하는 사용자.
	 */
	User get(String uid);

	/**
	 * 사용자 프로필을 바꾼다.
	 * 
	 * @param user
	 *            바꿀 사용자 프로필.
	 */
	void updateUserProfile(User user);

}
