package com.seoksik.test.dao;

import com.seoksik.test.entity.User;

/**
 * 사용자 DAO.
 * 
 * @author woozoo73
 */
public interface UserDAO {

	/**
	 * 사용자를 입력한다.
	 * 
	 * @param user
	 *            입력할 사용자.
	 * @return 생성된 사용자 아이디.
	 */
	String insert(User user);

	/**
	 * 이름을 갱신한다.
	 * 
	 * @param uid
	 *            갱신할 사용자 아이디.
	 * @param name
	 *            갱신할 이름.
	 * @return 갱신된 데이터 개수.
	 */
	int updateName(String uid, String name);

	/**
	 * 사용자를 삭제한다.
	 * 
	 * @param uid
	 *            삭제할 사용자 아이디.
	 * @return 삭제된 데이터 개수.
	 */
	int delete(String uid);

	/**
	 * 사용자를 조회한다.
	 * 
	 * @param uid
	 *            조회할 사용자 아이디.
	 * @return uid에 해당하는 사용자.
	 */
	User select(String uid);

}
