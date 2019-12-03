
package com.infotech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.infotech.messge.ActiveMQMessage;
import com.infotech.messge.Message;
import com.infotech.service.Communication;

@Configuration
public class SpringConfig {

	
	  @Bean public Communication communication() { 
		Communication communicationObject = new Communication(); 
		communicationObject.setMessage(message());
		  return communicationObject; 
		  }
	  
	  @Bean public Message message() { 
		  return new ActiveMQMessage(); 
		  
	  }
	 

}
