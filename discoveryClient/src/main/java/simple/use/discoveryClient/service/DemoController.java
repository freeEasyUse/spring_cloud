package simple.use.discoveryClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String readUserInfo(){
		return demoService.sayHello("this is server in discovery");
	} 
}
