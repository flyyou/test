package com.seoksik.test.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 사용자.
 * 
 * @author woozoo73
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String STATUS_ACTIVE = "on";

	public static final String STATUS_INACTIVE = "off";

	public static final String[] STATUS_VALUES = new String[] { STATUS_ACTIVE, STATUS_INACTIVE };

	/** User ID */
	private String uid;

	/** Samsung Account ID */
	private String guid;

	/** User name */
	private String name;

	/** User status (active, inactive) */
	private String status;

	/** Is photo uploaded */
	private String photoLoaded;

	/** User satus message */
	private String msgStatus;

	/** User birthday */
	private String birthday;

	/** Gender */
	private String gender;

	/** Samsung email */
	private String emailSamsung;

	/** email */
	private String email;

	/** Region (EU_WEST, APAC, etc) */
	private String region;

	/** Encoding key */
	private String encodingkey;

	/** Econding key create time */
	private long keyCreationDate;

	/** Ecoding key expire time */
	private long keyExpr;

	/** User name timestamp */
	private long tmspName;

	/** Photo upload timestamp */
	private long tmspPhotoLoaded;

	/** Status message timestamp */
	private long tmspMsgStatus;

	/** Birthday timestamp */
	private long tmspBirthday;

	/** Gender timestamp */
	private long tmspGender;

	/** Samsung email timestamp */
	private long tmspEmailSamsung;

	/** Email timestamp */
	private long tmspEmail;

	/** User table create timestamp */
	private long tmspUser;

	/** DOCUMENTME */
	private long tmspUserCreationDate;

	/** Input create time for batch job */
	private long changedTimestamp;

	/** DOCUMENTME */
	private long tmspDeviceCreationDate;

	/** 사용자 단말 목록 */
	private List<Device> deviceList;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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

	public String getPhotoLoaded() {
		return photoLoaded;
	}

	public void setPhotoLoaded(String photoLoaded) {
		this.photoLoaded = photoLoaded;
	}

	public String getMsgStatus() {
		return msgStatus;
	}

	public void setMsgStatus(String msgStatus) {
		this.msgStatus = msgStatus;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailSamsung() {
		return emailSamsung;
	}

	public void setEmailSamsung(String emailSamsung) {
		this.emailSamsung = emailSamsung;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEncodingkey() {
		return encodingkey;
	}

	public void setEncodingkey(String encodingkey) {
		this.encodingkey = encodingkey;
	}

	public long getKeyCreationDate() {
		return keyCreationDate;
	}

	public void setKeyCreationDate(long keyCreationDate) {
		this.keyCreationDate = keyCreationDate;
	}

	public long getKeyExpr() {
		return keyExpr;
	}

	public void setKeyExpr(long keyExpr) {
		this.keyExpr = keyExpr;
	}

	public long getTmspName() {
		return tmspName;
	}

	public void setTmspName(long tmspName) {
		this.tmspName = tmspName;
	}

	public long getTmspPhotoLoaded() {
		return tmspPhotoLoaded;
	}

	public void setTmspPhotoLoaded(long tmspPhotoLoaded) {
		this.tmspPhotoLoaded = tmspPhotoLoaded;
	}

	public long getTmspMsgStatus() {
		return tmspMsgStatus;
	}

	public void setTmspMsgStatus(long tmspMsgStatus) {
		this.tmspMsgStatus = tmspMsgStatus;
	}

	public long getTmspBirthday() {
		return tmspBirthday;
	}

	public void setTmspBirthday(long tmspBirthday) {
		this.tmspBirthday = tmspBirthday;
	}

	public long getTmspGender() {
		return tmspGender;
	}

	public void setTmspGender(long tmspGender) {
		this.tmspGender = tmspGender;
	}

	public long getTmspEmailSamsung() {
		return tmspEmailSamsung;
	}

	public void setTmspEmailSamsung(long tmspEmailSamsung) {
		this.tmspEmailSamsung = tmspEmailSamsung;
	}

	public long getTmspEmail() {
		return tmspEmail;
	}

	public void setTmspEmail(long tmspEmail) {
		this.tmspEmail = tmspEmail;
	}

	public long getTmspUser() {
		return tmspUser;
	}

	public void setTmspUser(long tmspUser) {
		this.tmspUser = tmspUser;
	}

	public long getTmspUserCreationDate() {
		return tmspUserCreationDate;
	}

	public void setTmspUserCreationDate(long tmspUserCreationDate) {
		this.tmspUserCreationDate = tmspUserCreationDate;
	}

	public long getChangedTimestamp() {
		return changedTimestamp;
	}

	public void setChangedTimestamp(long changedTimestamp) {
		this.changedTimestamp = changedTimestamp;
	}

	public long getTmspDeviceCreationDate() {
		return tmspDeviceCreationDate;
	}

	public void setTmspDeviceCreationDate(long tmspDeviceCreationDate) {
		this.tmspDeviceCreationDate = tmspDeviceCreationDate;
	}

	public List<Device> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<Device> deviceList) {
		this.deviceList = deviceList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [uid=");
		builder.append(uid);
		builder.append(", guid=");
		builder.append(guid);
		builder.append(", name=");
		builder.append(name);
		builder.append(", status=");
		builder.append(status);
		builder.append(", photoLoaded=");
		builder.append(photoLoaded);
		builder.append(", msgStatus=");
		builder.append(msgStatus);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", emailSamsung=");
		builder.append(emailSamsung);
		builder.append(", email=");
		builder.append(email);
		builder.append(", region=");
		builder.append(region);
		builder.append(", encodingkey=");
		builder.append(encodingkey);
		builder.append(", keyCreationDate=");
		builder.append(keyCreationDate);
		builder.append(", keyExpr=");
		builder.append(keyExpr);
		builder.append(", tmspName=");
		builder.append(tmspName);
		builder.append(", tmspPhotoLoaded=");
		builder.append(tmspPhotoLoaded);
		builder.append(", tmspMsgStatus=");
		builder.append(tmspMsgStatus);
		builder.append(", tmspBirthday=");
		builder.append(tmspBirthday);
		builder.append(", tmspGender=");
		builder.append(tmspGender);
		builder.append(", tmspEmailSamsung=");
		builder.append(tmspEmailSamsung);
		builder.append(", tmspEmail=");
		builder.append(tmspEmail);
		builder.append(", tmspUser=");
		builder.append(tmspUser);
		builder.append(", tmspUserCreationDate=");
		builder.append(tmspUserCreationDate);
		builder.append(", changedTimestamp=");
		builder.append(changedTimestamp);
		builder.append(", tmspDeviceCreationDate=");
		builder.append(tmspDeviceCreationDate);
		builder.append(", deviceList=");
		builder.append(deviceList);
		builder.append("]");
		return builder.toString();
	}

}
