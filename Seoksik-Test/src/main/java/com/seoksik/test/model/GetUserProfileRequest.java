package com.seoksik.test.model;

/**
 * 사용자 프로필 조회 요청.
 * 
 * @author woozoo73
 */
public class GetUserProfileRequest extends AuthKeyRequest {

	private static final long serialVersionUID = 1L;

	/** user profile update 시각 */
	private long timestamp;

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GetUserProfileRequest [uid=");
		builder.append(uid);
		builder.append(", imei=");
		builder.append(imei);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append("]");
		return builder.toString();
	}

}
