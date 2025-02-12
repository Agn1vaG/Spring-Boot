package udemy_learn2.learn_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class LearnSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

}
