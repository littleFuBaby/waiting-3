package org.ownsbson.controller;

import org.ownsbson.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController extends AbstractController {

	@Autowired
	private MessageService messageService;

	@RequestMapping("/getMsg")
	@ResponseBody
	public String getMsg(String mid) {
		return super.getMessage("welcome.msg", mid);
	}

	@RequestMapping("/getNewMsg")
	@ResponseBody
	public String getNewMsg(String mid) {
		return this.messageService.getMsg(mid);
	}

	@RequestMapping("/showTemplate")
	public String showTemplate(String mid, Model model) {
		model.addAttribute("url", "www.fuys.c");
		model.addAttribute("mid", mid);
		return "message_show";
	}

}
