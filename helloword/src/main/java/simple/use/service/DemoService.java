package simple.use.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class DemoService {

	 @Autowired	 
	 RestTemplate restTemplate;
	 
	 final String SERVICE_NAME="cloud-discoveryClient-service";
	 
	 @HystrixCommand(fallbackMethod = "fallbackSearchAll")	//熔断机制  服务不存在 直接调用 fallbackSearchAll方法
	 public String readUserInfo() {
	        return restTemplate.getForObject("http://"+SERVICE_NAME+"/user", String.class);
	 }	 
	 
	 
	 @SuppressWarnings("unused")
	private String fallbackSearchAll(){
		 return "this is private fallbackSearchAll";
	 }
	
}
