package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

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
