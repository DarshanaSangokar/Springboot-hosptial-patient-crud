package com.code.exception;

import java.util.Date;

public class ErrorDetail {
	private Date timeStamp;
	private String Message;
	private String Details;
	
	
	public ErrorDetail(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		Message = message;
		Details = details;
	}
	
	public ErrorDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getTimeStamp() {
		return timeStamp;
	}
//	public void setTimeStamp(Date timeStamp) {
//		this.timeStamp = timeStamp;
//	}
	public String getMessage() {
		return Message;
	}
//	public void setMessage(String message) {
//		Message = message;
//	}
	public String getDetails() {
		return Details;
	}
//	public void setDetails(String details) {
//		Details = details;
//	}
	
	
	
}
