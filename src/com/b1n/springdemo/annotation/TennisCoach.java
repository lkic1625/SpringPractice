package com.b1n.springdemo.annotation;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Something Do";
    }
}
