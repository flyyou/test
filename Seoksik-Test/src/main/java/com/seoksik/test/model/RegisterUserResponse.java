package com.seoksik.test.model;

import java.io.Serializable;

/**
 * 사용자 등록 응답.
 * 
 * @author woozoo73
 */
public class RegisterUserResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 생성된 사용자 uid */
	private String uid;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterUserResponse [uid=");
		builder.append(uid);
		builder.append("]");
		return builder.toString();
	}

}
