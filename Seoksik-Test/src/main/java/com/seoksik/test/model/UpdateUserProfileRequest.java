package com.seoksik.test.model;

/**
 * 사용자 프로필 변경 요청.
 * 
 * @author woozoo73
 */
public class UpdateUserProfileRequest extends AuthKeyRequest {

	private static final long serialVersionUID = 1L;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UpdateUserProfileRequest [uid=");
		builder.append(uid);
		builder.append(", imei=");
		builder.append(imei);
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
		builder.append("]");
		return builder.toString();
	}

}
