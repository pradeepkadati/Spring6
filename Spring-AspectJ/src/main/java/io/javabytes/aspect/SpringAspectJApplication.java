package io.javabytes.aspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
//@EnableAspectJAutoProxy
public class SpringAspectJApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAspectJApplication.class, args);
	}

}
