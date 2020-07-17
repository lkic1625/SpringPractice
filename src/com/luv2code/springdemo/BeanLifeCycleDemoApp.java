package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        TrackCoach thaCoach = context.getBean("myCoach", TrackCoach.class);
        System.out.println(thaCoach.getDailyFortune());

        context.close();
    }
}
