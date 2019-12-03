package com.infotech.service;

import com.infotech.messge.Message;


public class Communication {


	private Message message;

	public Communication() {
		
	}
	
	//Constructor DI
	/*
	 * public Communication(Message message) { this.message = message; }
	 */
	
	//Setter DI
	public void setMessage(Message message) {
		this.message = message;
	}
	
	public void communicate(){
		message.sendMessage();
	}
}
