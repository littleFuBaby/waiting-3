package org.ownsbson.service.impl;

import java.util.Locale;

import javax.annotation.Resource;

import org.ownsbson.service.MessageService;
import org.springframework.context.MessageSource;

public class MessageServiceImpl implements MessageService {

	@Resource
	private MessageSource messageSource;

	@Override
	public String getMsg(String... mid) {
		return this.messageSource.getMessage("welcome.msg", mid, Locale.getDefault());
	}

}
