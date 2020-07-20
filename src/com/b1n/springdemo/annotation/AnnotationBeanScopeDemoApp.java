package com.b1n.springdemo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
        Coach coach1 = context.getBean("tennisCoach", Coach.class);
        Coach coach2 = context.getBean("tennisCoach", Coach.class);

        System.out.println("Pointing to same object: " + (coach1 == coach2));
        System.out.println("Memory Loacation for coach1: " + coach1);
        System.out.println("Memory Loacation for coach2: " + coach2);

    }
}
