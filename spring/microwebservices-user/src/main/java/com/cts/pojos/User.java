package com.cts.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
	@Id
	
		private String id;
	
	private String userName;
	private String password;
	private String userType;
	private String email;
	private String mobileNumber;
	private String confirmed;
	private String profileImage;
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType=" + userType
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", confirmed=" + confirmed + ", profileImage="
				+ profileImage + "]";
	}
	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}


	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	
		


}
