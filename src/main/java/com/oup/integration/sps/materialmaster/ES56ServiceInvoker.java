package com.oup.integration.sps.materialmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:META-INF/spring/ES56-MaterialMaster-MainContext.xml"})
public class ES56ServiceInvoker {

	public static void main(String[] args) {
		SpringApplication.run(ES56ServiceInvoker.class, args);
	}
}
