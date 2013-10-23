package com.seoksik.test.model;

import java.io.Serializable;

/**
 * 사용자 등록 요청.
 * 
 * @author woozoo73
 */
public class RegisterUserRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 기기 MSISDN */
	private String msisdn;

	/** 기기 IMEI */
	private String imei;

	/** Push registration ID */
	private String regid;

	/** Push type */
	private String pushtype;

	/** OS version */
	private String osversion;

	/** 기기 IMSI */
	private String imsi;

	/** 기기 model */
	private String model;

	/** User 이름 */
	private String name;

	/** Samsung email */
	private String emailsamsung;

	/** SMS 인증 token */
	private String token;

	/** SMS 인증 번호 */
	private String authnum;

	/** 단말 정보 key, value 목록 */
	private String einfo;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getRegid() {
		return regid;
	}

	public void setRegid(String regid) {
		this.regid = regid;
	}

	public String getPushtype() {
		return pushtype;
	}

	public void setPushtype(String pushtype) {
		this.pushtype = pushtype;
	}

	public String getOsversion() {
		return osversion;
	}

	public void setOsversion(String osversion) {
		this.osversion = osversion;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailsamsung() {
		return emailsamsung;
	}

	public void setEmailsamsung(String emailsamsung) {
		this.emailsamsung = emailsamsung;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAuthnum() {
		return authnum;
	}

	public void setAuthnum(String authnum) {
		this.authnum = authnum;
	}

	public String getEinfo() {
		return einfo;
	}

	public void setEinfo(String einfo) {
		this.einfo = einfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterUserRequest [msisdn=");
		builder.append(msisdn);
		builder.append(", imei=");
		builder.append(imei);
		builder.append(", regid=");
		builder.append(regid);
		builder.append(", pushtype=");
		builder.append(pushtype);
		builder.append(", osversion=");
		builder.append(osversion);
		builder.append(", imsi=");
		builder.append(imsi);
		builder.append(", model=");
		builder.append(model);
		builder.append(", name=");
		builder.append(name);
		builder.append(", emailsamsung=");
		builder.append(emailsamsung);
		builder.append(", token=");
		builder.append(token);
		builder.append(", authnum=");
		builder.append(authnum);
		builder.append(", einfo=");
		builder.append(einfo);
		builder.append("]");
		return builder.toString();
	}

}
