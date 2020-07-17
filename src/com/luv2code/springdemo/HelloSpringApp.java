package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    static public String PathXML = "com\\luv2code\\springdemo\\applicationContext.xml";
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com\\luv2code\\springdemo\\applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach trackCoachTest = context.getBean("myTrackCoach", Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(trackCoachTest.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
