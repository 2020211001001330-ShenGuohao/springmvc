package com.sgh.pojo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.io.Serializable;


public class User implements Serializable{

	@NotBlank(message="登录名不能为空")
	private String username;
	@NotBlank(message="密码不能为空")
	@Length(min=6,max=18,message="密码长度必须在6~18位之间")
	private String password;
	@Email(message="邮箱格式不正确")
	private String email;
	@Pattern(regexp="[1][3|4|5|7|8][0-9]{9}",message="手机号码格式不正确")
	private String phone;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
