package simple.use.discoveryClient.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public String sayHello(String content){
		return content+"hello";
	}
	
}
