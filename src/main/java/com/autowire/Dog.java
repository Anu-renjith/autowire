package com.autowire;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    @Value("sss")
    private String name;
    public Dog(){
        System.out.println("dog objects created");
    }
    public void sound(){
        System.out.println(name+"boww");
    }
}


