package st.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoFeignClientHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignClientHelloApplication.class, args);
	}
}
