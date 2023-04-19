package com.geekster.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration //Whatever Object will create here...Will call by the SpringFramework...We will not call them.
@ComponentScan(basePackages = {"ComponentScan"})
public class CustomConfiguration { //is class ka purpose hai Bean/Object create krna.
    @Bean("tej")  //Yah ek function hai jiska Jo Tejasvi naam ka Bean return kar raha hai.
    @Lazy
    //Bean is also a Java Object, Just there are some restriction.
    public Student getStudent1(){
        System.out.println("Spring call.....in config with bean of Student");
        return new Student("Tejasvi");
    }

    @Bean("has")  //Yah ek function hai jiska Jo Tejasvi naam ka Bean return kar raha hai.
    public Student getStudent2(){
        System.out.println("Spring call.....in config with bean of Student");
        return new Student("Harsh");
    }
}
