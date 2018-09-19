package st.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoFeignClientController {

	@Autowired
	DemoFeignClientAgent clientAgent;
	
	@RequestMapping(value = "/hello-feign", method = RequestMethod.GET)
	public String helloClient() {
		return clientAgent.helloFeign();
	}
	
	@RequestMapping(value = "/hello-feign2", method = RequestMethod.GET)
	public String helloClient2() {
		StringBuilder sb = new StringBuilder();
		sb.append(clientAgent.helloFeign()).append("<br>");
		sb.append(clientAgent.helloFeign("Jack")).append("<br>");
		sb.append(clientAgent.helloFeign("Kate", 30)).append("<br>");
		sb.append(clientAgent.helloFeign(new DemoUser("Rose", 28)));
		return sb.toString();
	}
	
}
