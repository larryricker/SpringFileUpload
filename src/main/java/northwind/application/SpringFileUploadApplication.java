package northwind.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"northwind.application", "northwind.controller"})
public class SpringFileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFileUploadApplication.class, args);
	}

}
