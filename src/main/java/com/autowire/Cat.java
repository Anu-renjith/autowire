package com.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    @Value("kittu")
    private String name;
    public Cat(){
        System.out.println("cat objects created");
    }
    public void sound(){
        System.out.println(name+"meow");
    }
}
