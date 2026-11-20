
package Ganesh_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GaneshSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaneshSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner printMessage() {
		return args -> System.out.println("Jay Ganesh...");
	}
}
