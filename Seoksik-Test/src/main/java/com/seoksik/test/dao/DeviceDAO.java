package com.seoksik.test.dao;

import java.util.List;

import com.seoksik.test.entity.Device;
import com.seoksik.test.entity.User;

/**
 * 단말 DAO.
 * 
 * @author woozoo73
 */
public interface DeviceDAO {

	/**
	 * 단말을 입력한다.
	 * 
	 * @param device
	 *            입력할 단말.
	 * @return 생성된 단말 아이디.
	 */
	String insert(Device device);

	/**
	 * 단말을 조회한다.
	 * 
	 * @param uid
	 *            조회할 사용자 아이디.
	 * @param deviceID
	 *            조회할 단말 아이디.
	 * @return 사용자 아이디, 단말 아이디에 해당하는 단말.
	 */
	User select(String uid, String deviceID);

	/**
	 * 사용자 단말 목록을 조회한다.
	 * 
	 * @param uid
	 *            조회할 사용자 아이디.
	 * @return 사용자 아이디에 해당하는 단말 목록.
	 */
	List<User> selectByUid(String uid);

}
