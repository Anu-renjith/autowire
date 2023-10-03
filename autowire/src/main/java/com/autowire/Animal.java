package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Animal {
   @Autowired
   Dog d;
   @Autowired
   Cat c;
   public Animal(){
    System.out.println("animal object created");
   } 
   public void  displayAnimal(){
    System.out.println("cat");
    c.sound();
    System.out.println("dog:");
    d.sound();
   }
}
