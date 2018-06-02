package org.ownsbson.config;

import org.ownsbson.service.MessageService;
import org.ownsbson.service.impl.MessageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	
	@Bean
	public MessageService getMessageService(){
		return new MessageServiceImpl();
	}	

}
