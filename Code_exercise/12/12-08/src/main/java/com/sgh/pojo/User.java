package com.sgh.pojo;

import java.util.Date;

public class User {
    private String username;        //用户名
    private String password;        //用户密码
    private Date birthday;			//生日

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
    
}

