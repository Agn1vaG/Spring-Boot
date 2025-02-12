package udemy.Lproject.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

     @Bean
    public String name(){
        return "Agniva";
    }
    @Bean
    public int age(){
        return 23;
    }
    @Bean
    public Person person(){
         return new Person("Ravi", 28,new Address("Garia", "Kolkata") );
    }
    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(), address2());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address2){
        return new Person(name, age, address2);
    }
    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }
    @Bean(name = "address2")
    @Primary
    public Address address2(){
        return new Address("Behala", "Kolkata");
    }
    @Bean(name = "address3")
    public Address address3(){
        return new Address("Golpark", "Kolkata");
    }
}
