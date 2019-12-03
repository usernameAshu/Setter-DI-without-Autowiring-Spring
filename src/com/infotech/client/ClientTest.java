package com.infotech.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infotech.config.SpringConfig;
import com.infotech.service.Communication;

public class ClientTest {

	public static void main(String[] args) {

		
		  AnnotationConfigApplicationContext ctx = null;
		  
		  try { ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		  Communication comm = ctx.getBean("communication", Communication.class);
		  comm.communicate();
		  
		  } catch (Exception e) { e.printStackTrace();
		  
		  } finally { if (ctx != null) ctx.close();
		  
		  }
		 

		/*
		 * Message message = null; Communication objectCommunication = new
		 * Communication(message); objectCommunication.communicate();
		 */
	}

}
