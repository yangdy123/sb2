package com.ydy.mongodb;

import java.io.Serializable;

import com.google.gson.Gson;

public class UserEx implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int ex_int;
	public String ex_str;

	public UserEx() {
		
	}
	
	public UserEx(int exint, String exStr) {
		this.ex_int = exint;
		this.ex_str = exStr;
	}
	
	public int getEx_int() {
		return ex_int;
	}

	public void setEx_int(int ex_int) {
		this.ex_int = ex_int;
	}

	public String getEx_str() {
		return ex_str;
	}

	public void setEx_str(String ex_str) {
		this.ex_str = ex_str;
	}
	
	public String toString() {
		return new Gson().toJson(this);
	}
}
