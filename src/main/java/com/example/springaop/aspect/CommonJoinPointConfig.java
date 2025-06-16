package com.example.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class CommonJoinPointConfig {


    // This class can be used to define common pointcuts that can be reused across different aspects.
    // For example, you can define a pointcut for all methods in the business package.

    // Example of a pointcut that matches all methods in the business package
    // @Pointcut("execution(* com.example.springaop.bussines..*(..))")
    // public void businessMethods() {}

    // You can add more common pointcuts here as needed.

    @Pointcut("execution(* com.example.springaop.bussines..*(..))")
    public void businessMethods() {
        // This pointcut matches all methods in the business package and its sub-packages.
    }

    @Pointcut("execution(* com.example.springaop.data..*(..))")
    public void dataMethods() {
        // This pointcut matches all methods in the data package and its sub-packages.
    }

    @Pointcut("execution(* com.example.springaop.bussines.Bussines1.*(..))")
    public void business1Methods() {
        // This pointcut matches all methods in the business package and its sub-packages.
    }
    @Pointcut("execution(* com.example.springaop.bussines.Bussines2.*(..))")
    public void business2Methods() {
        // This pointcut matches all methods in the business package and its sub-packages.
    }



}
