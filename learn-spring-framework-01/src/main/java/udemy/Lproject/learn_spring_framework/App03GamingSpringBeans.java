package udemy.Lproject.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import udemy.Lproject.learn_spring_framework.game.GameConsole;
import udemy.Lproject.learn_spring_framework.game.GameRunner;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfig.class);){

            context.getBean(GameConsole.class).up();

            context.getBean(GameRunner.class).run();


        }
    }
}
