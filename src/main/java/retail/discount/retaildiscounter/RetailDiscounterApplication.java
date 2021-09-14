package retail.discount.retaildiscounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "bean" + "controller")
public class RetailDiscounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailDiscounterApplication.class, args);

	}

}
