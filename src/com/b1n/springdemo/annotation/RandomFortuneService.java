package com.b1n.springdemo.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @Value("${fortune.array}")
    private String[] fortuneArray;

    public void setFortuneArray(String[] fortuneArray) {
        System.out.println("RandomFortuneService: inside setter method - setFortuneArray");
        this.fortuneArray = fortuneArray;
    }

    @Override
    public String getFortune() {
        Random rand = new Random();
        return fortuneArray[rand.nextInt(fortuneArray.length)];
    }
}
