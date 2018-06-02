package org.ownsbson.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSampleController {

	@RequestMapping("/echo")
	public String echo(String msg) {
		return "【echo】:" + msg;
	}

	@RequestMapping(value = "/show/{msg}", method = RequestMethod.GET)
	public String show(@PathVariable("msg") String msg) {
		return "【show11】:" + msg;
	}

}
