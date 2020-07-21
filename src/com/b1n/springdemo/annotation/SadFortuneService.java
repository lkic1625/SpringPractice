package com.b1n.springdemo.annotation;

public class SadFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
