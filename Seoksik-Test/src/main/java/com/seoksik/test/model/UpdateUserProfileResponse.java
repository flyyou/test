package com.seoksik.test.model;

import java.io.Serializable;

/**
 * 사용자 프로필 변경 응답.
 * 
 * @author woozoo73
 */
public class UpdateUserProfileResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	/** User profile 생성 시각 */
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
		builder.append("UpdateUserProfileResponse [timestamp=");
		builder.append(timestamp);
		builder.append("]");
		return builder.toString();
	}

}
