package udemy.Lproject.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import udemy.Lproject.learn_spring_framework.helloworld.Address;
import udemy.Lproject.learn_spring_framework.helloworld.Person;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        //Launch Spring Context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {


            //Retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean(Person.class));
        }
    }
}
