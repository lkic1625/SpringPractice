package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com\\luv2code\\springdemo\\applicationContext.xml");
        //retrieve bean from spring container
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        context.close();
    }
}
