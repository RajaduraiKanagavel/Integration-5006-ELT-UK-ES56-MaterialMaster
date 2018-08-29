package com.oup.integration.sps.movingaverageprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:META-INF/spring/NP05-MovingAveragePrice-MainContext.xml"})
public class NP05ServiceInvoker {

	public static void main(String[] args) {
		SpringApplication.run(NP05ServiceInvoker.class, args);
	}
}
