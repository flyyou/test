package com.seoksik.test.entity;

/**
 * 단말.
 * 
 * @author woozoo73
 */
public class Device {

	/** User ID */
	private String uid;

	/** Device ID (from IMEI) */
	private String deviceID;

	/** DOCUMENTME */
	private String status;

	/** OS version (platform info) */
	private String osversion;

	/** DOCUMENTME */
	private String appversion;

	/** Push type (Samsung PUSH, Android(C2DN), etc) */
	private String pushType;

	/** Push reg ID */
	private String pushID;

	/** MSISDN */
	private String msisdn;

	/** Device model */
	private String model;

	/** IMSI */
	private String imsi;

	/** email */
	private String email;

	/** device table timestamp */
	private long tmspDevice;

	/** DOCUMENTME */
	private long tmspDeviceCreationDate;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOsversion() {
		return osversion;
	}

	public void setOsversion(String osversion) {
		this.osversion = osversion;
	}

	public String getAppversion() {
		return appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

	public String getPushType() {
		return pushType;
	}

	public void setPushType(String pushType) {
		this.pushType = pushType;
	}

	public String getPushID() {
		return pushID;
	}

	public void setPushID(String pushID) {
		this.pushID = pushID;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTmspDevice() {
		return tmspDevice;
	}

	public void setTmspDevice(long tmspDevice) {
		this.tmspDevice = tmspDevice;
	}

	public long getTmspDeviceCreationDate() {
		return tmspDeviceCreationDate;
	}

	public void setTmspDeviceCreationDate(long tmspDeviceCreationDate) {
		this.tmspDeviceCreationDate = tmspDeviceCreationDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result + ((deviceID == null) ? 0 : deviceID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		if (deviceID == null) {
			if (other.deviceID != null)
				return false;
		} else if (!deviceID.equals(other.deviceID))
			return false;

		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Device [uid=");
		builder.append(uid);
		builder.append(", deviceID=");
		builder.append(deviceID);
		builder.append(", status=");
		builder.append(status);
		builder.append(", osversion=");
		builder.append(osversion);
		builder.append(", appversion=");
		builder.append(appversion);
		builder.append(", pushType=");
		builder.append(pushType);
		builder.append(", pushID=");
		builder.append(pushID);
		builder.append(", msisdn=");
		builder.append(msisdn);
		builder.append(", model=");
		builder.append(model);
		builder.append(", imsi=");
		builder.append(imsi);
		builder.append(", email=");
		builder.append(email);
		builder.append(", tmspDevice=");
		builder.append(tmspDevice);
		builder.append(", tmspDeviceCreationDate=");
		builder.append(tmspDeviceCreationDate);
		builder.append("]");
		return builder.toString();
	}

}
