package st.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("${service.hello.name}")
public interface DemoFeignClientAgent {
	
	@RequestMapping("${service.hello.uri}")
	public String helloFeign();

}
