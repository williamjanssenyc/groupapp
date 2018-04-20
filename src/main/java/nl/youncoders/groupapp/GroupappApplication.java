package nl.youncoders.groupapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class GroupappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupappApplication.class, args);
	}

	@Bean
	ServletRegistrationBean myServletRegistration () {
		ServletRegistrationBean srb = new ServletRegistrationBean();
		srb.setServlet(new TestServlet());
		srb.setUrlMappings(Arrays.asList("/index", "/foo"));
		return srb;
	}
}
