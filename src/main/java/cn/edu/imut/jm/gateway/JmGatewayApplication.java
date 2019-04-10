package cn.edu.imut.jm.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class JmGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmGatewayApplication.class, args);
	}

}
