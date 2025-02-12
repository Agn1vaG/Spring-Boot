package udemy.Lproject.learn_spring_framework.example.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

@Configuration
@ComponentScan
public class LazyInitializionLauncherApplication {


    public static void main(String[] args) {

        try (var context =
                    new AnnotationConfigApplicationContext
                            (LazyInitializionLauncherApplication.class)){

             Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);


        }
    }
}
