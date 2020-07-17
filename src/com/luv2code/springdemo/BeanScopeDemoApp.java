package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com\\luv2code\\springdemo\\beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach anotherCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == anotherCoach);
        System.out.println(result);
        System.out.println(theCoach);
        System.out.println(anotherCoach);

        context.close();
    }
}
