package simple.use.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import simple.use.config.Config;
import simple.use.service.DemoService;

@Controller
public class Controller1 {
	
	@Autowired
	private Config config;
	
	@Autowired
	private DemoService  demoService;
	
	@ResponseBody
	@RequestMapping(value = "/")
	String home() {
		return "Hello World!"+config.getPassword()+config.getUrl()+demoService.readUserInfo();
	}
	
}
