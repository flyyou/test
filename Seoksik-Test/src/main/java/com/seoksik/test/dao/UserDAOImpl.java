package com.seoksik.test.dao;

import java.util.UUID;

import com.seoksik.test.entity.User;

public class UserDAOImpl implements UserDAO {

	public String insert(User user) {
		if (user == null || user.getName() == null) {
			throw new RuntimeException("user name must not be null.");
		}

		return UUID.randomUUID().toString();
	}

	public int updateName(String uid, String name) {
		return 0;
	}

	public int delete(String uid) {
		return 0;
	}

	public User select(String uid) {
		return null;
	}

}
