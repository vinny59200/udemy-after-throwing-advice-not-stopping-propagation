package com.vv.udemyspring;

import com.vv.udemyspring.configuration.AspectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class UdemyspringApplication {

	public static void main(String[] args) {

		SpringApplication.run(UdemyspringApplication.class, args);


	}

}
