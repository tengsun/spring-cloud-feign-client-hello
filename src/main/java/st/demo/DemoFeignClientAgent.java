package st.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${service.hello.name}", fallback = DemoFeignClientFallback.class)
public interface DemoFeignClientAgent {
	
	@RequestMapping("${service.hello.uri}")
	public String helloFeign();
	
	@RequestMapping("${service.hello1.uri}")
	public String helloFeign(@RequestParam("name") String name);
	
	@RequestMapping("${service.hello2.uri}")
	public DemoUser helloFeign(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
	
	@RequestMapping("${service.hello3.uri}")
	public String helloFeign(@RequestBody DemoUser user);

}
