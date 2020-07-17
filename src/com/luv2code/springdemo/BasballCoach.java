package com.luv2code.springdemo;

public class BasballCoach implements Coach {

    private FortuneService fortuneService;

    BasballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

}
