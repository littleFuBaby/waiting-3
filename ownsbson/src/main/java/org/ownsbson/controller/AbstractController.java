package org.ownsbson.controller;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;

public abstract class AbstractController {
	
	@Resource
	private MessageSource messageSource;
	
	public String getMessage(String key,String ...args) {
		return this.messageSource.getMessage(key, args, Locale.getDefault());
	}

}
