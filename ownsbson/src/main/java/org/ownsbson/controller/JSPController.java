package org.ownsbson.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSPController {

	@RequestMapping("/req")
	@ResponseBody
	public String req(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("客户端地址：" + request.getRemoteAddr());
		System.out.println("客户端响应编码：" + response.getCharacterEncoding());
		System.out.println("SessionID：" + request.getSession().getId());
		System.out.println("真实目录地址：" + request.getServletContext().getRealPath("/"));
		return "request";
	}

}
