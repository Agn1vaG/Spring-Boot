package udemy.Lproject.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import udemy.Lproject.learn_spring_framework.game.GameConsole;
import udemy.Lproject.learn_spring_framework.game.GameRunner;
import udemy.Lproject.learn_spring_framework.game.PacManGame;

@Configuration
public class GamingConfig {

    @Bean
    public GameConsole game(){
        var game = new PacManGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GameConsole game){
        var gameRunner =  new GameRunner(game);
        return gameRunner;
    }

}
