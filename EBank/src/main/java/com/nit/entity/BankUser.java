package com.nit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class BankUser {
	
	@Id
	private int user_id;
	
	private String user_name;
	private String user_email;
	private int user_phone;
	private String user_account_type;
	private String user_password;
	private String user_atatus;
	private  String user_request_date;
	private String user_appruv_date;
	
	
	public BankUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_account_type() {
		return user_account_type;
	}
	public void setUser_account_type(String user_account_type) {
		this.user_account_type = user_account_type;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_atatus() {
		return user_atatus;
	}
	public void setUser_atatus(String user_atatus) {
		this.user_atatus = user_atatus;
	}
	public String getUser_request_date() {
		return user_request_date;
	}
	public void setUser_request_date(String user_request_date) {
		this.user_request_date = user_request_date;
	}
	public String getUser_appruv_date() {
		return user_appruv_date;
	}
	public void setUser_appruv_date(String user_appruv_date) {
		this.user_appruv_date = user_appruv_date;
	}
	
	@Override
	public String toString() {
		return "BankUser [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_phone=" + user_phone + ", user_account_type=" + user_account_type + ", user_password="
				+ user_password + ", user_atatus=" + user_atatus + ", user_request_date=" + user_request_date
				+ ", user_appruv_date=" + user_appruv_date + "]";
	}
	
	
	
}
