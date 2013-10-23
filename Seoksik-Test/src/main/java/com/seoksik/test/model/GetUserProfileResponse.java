package com.seoksik.test.model;

import java.io.Serializable;

/**
 * 사용자 프로필 조회 응답.
 * 
 * @author woozoo73
 */
public class GetUserProfileResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 생성 시각 */
	private long timestamp;

	/** User Name */
	private String name;

	/** 상태 메세지 */
	private String status;

	/** 생일 정보 YYYY-MM-DD 또는 MM-DD */
	private String birthday;

	/** Email */
	private String email;

	/** Samsung email */
	private String samsungemail;

	/**
	 * User profile image 상태 여부.
	 * 
	 * <pre>
	 * 1: updated, 2: deleted, 3: not exist, 4: not changed
	 * </pre>
	 */
	private String imgstatus;

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSamsungemail() {
		return samsungemail;
	}

	public void setSamsungemail(String samsungemail) {
		this.samsungemail = samsungemail;
	}

	public String getImgstatus() {
		return imgstatus;
	}

	public void setImgstatus(String imgstatus) {
		this.imgstatus = imgstatus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GetUserProfileResponse [timestamp=");
		builder.append(timestamp);
		builder.append(", name=");
		builder.append(name);
		builder.append(", status=");
		builder.append(status);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", email=");
		builder.append(email);
		builder.append(", samsungemail=");
		builder.append(samsungemail);
		builder.append(", imgstatus=");
		builder.append(imgstatus);
		builder.append("]");
		return builder.toString();
	}

}
