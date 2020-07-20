package com.b1n.springdemo.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
//    So, the first thing Spring will do
//    is it will actually construct the class
//    by calling the default constructor
//    and then it will actually inject
//    a fortuneService implementation directly into this class
//    making use of some Java technology called Reflection.

//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }

    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }
//
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside setFortuneService() method");
//        this.fortuneService = fortuneService;
//    }
//
//    @Autowired
//    public void doSomeStudff(FortuneService fortuneService){
//        System.out.println(fortuneService.getFortune());
//    }
//
//    @Autowired
//    public void doSomeStudff2(FortuneService fortuneService){
//        System.out.println(fortuneService.getFortune() + 2);
//    }

    @Override
    public String getDailyWorkout() {
        return "Something Do";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
