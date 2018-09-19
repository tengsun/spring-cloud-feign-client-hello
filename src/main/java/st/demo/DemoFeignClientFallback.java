package st.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoFeignClientFallback implements DemoFeignClientAgent {

	@Override
	public String helloFeign() {
		return "error";
	}

	@Override
	public String helloFeign(String name) {
		return "error";
	}

	@Override
	public DemoUser helloFeign(String name, Integer age) {
		return new DemoUser("unknown", 0);
	}

	@Override
	public String helloFeign(DemoUser user) {
		return "error";
	}

}
