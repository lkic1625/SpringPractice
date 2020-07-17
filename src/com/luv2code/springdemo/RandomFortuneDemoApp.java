package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com\\luv2code\\springdemo\\applicationContext.xml");

        RandomFortuneService fortune = context.getBean("randomFortuneService", RandomFortuneService.class);

        System.out.println(fortune.getFortune());


    }
}
