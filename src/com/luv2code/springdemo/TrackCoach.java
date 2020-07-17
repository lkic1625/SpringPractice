package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    public void doMyCleanUpStuff(){
        System.out.println("TrackCoach: inside method doMyCleanUpStuff");
    }
}
