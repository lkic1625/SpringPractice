package com.b1n.springdemo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.b1n.springdemo.annotation")
public class SportConfig extends MyLoggerConfig {

    @Bean
    public FortuneService sadFortunesService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortunesService());
    }

}
