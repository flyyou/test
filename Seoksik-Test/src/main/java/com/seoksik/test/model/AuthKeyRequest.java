package com.seoksik.test.model;

import java.io.Serializable;

/**
 * 인증 정보를 포함한 요청.
 * 
 * @author woozoo73
 */
public abstract class AuthKeyRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 사용자 아이디 */
	protected String uid;

	/** 기기 IMEI */
	protected String imei;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthKeyRequest [uid=");
		builder.append(uid);
		builder.append(", imei=");
		builder.append(imei);
		builder.append("]");
		return builder.toString();
	}

}
