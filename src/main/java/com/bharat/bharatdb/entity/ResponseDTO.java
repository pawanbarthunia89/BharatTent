package com.bharat.bharatdb.entity;

import lombok.Data;

@Data
public class ResponseDTO {

	private Object objectBody;
	private Integer responseCode;
	private Integer errorCode;
	private String errorMessge;
	private String message;
	private String debugMessage;
	
	public ResponseDTO(Object body) {
		this.objectBody=body;
		this.responseCode=200;
	}
	
	public ResponseDTO(String errorMeassage,Integer errorCode) {
		this.errorMessge=errorMeassage;
		this.errorCode=errorCode;
	}
}
