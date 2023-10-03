package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
    Animal ani=cont.getBean(Animal.class);
    ani.displayAnimal();
    }
}
