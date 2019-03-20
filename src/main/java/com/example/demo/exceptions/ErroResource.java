package com.example.demo.exceptions;

import java.io.Serializable;

public class ErroResource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer statusHttp;
	private String message;
	
	public ErroResource(Integer statusHttp, String message) {
		super();
		this.statusHttp = statusHttp;
		this.message = message;
	}
	
	public ErroResource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Integer getStatusHttp() {
		return statusHttp;
	}
	
	public void setStatusHttp(Integer statusHttp) {
		this.statusHttp = statusHttp;
	}
	
}
