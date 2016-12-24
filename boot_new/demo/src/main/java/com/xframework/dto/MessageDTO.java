package com.xframework.dto;

import com.xframework.util.MessageType;

/**
 * Created by Len on 18/12/2016.
 */
public class MessageDTO {

	private String message;

	private MessageType type;

	public MessageDTO() {
	}

	public MessageDTO(MessageType type, String message) {
		this.message = message;
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}
}
