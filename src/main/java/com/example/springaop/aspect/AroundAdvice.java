package com.example.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAdvice {
    // This aspect can be used to define around advice for methods in the business package.
    // You can add pointcuts and advice methods here as needed.

    // Example of an around advice method
    // @Around("businessMethods()")
    // public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
    //     System.out.println("Before method: " + joinPoint.getSignature());
    //     Object result = joinPoint.proceed();
    //     System.out.println("After method: " + joinPoint.getSignature());
    //     return result;
    // }

    /// if we want to calculate the time taken by a method, we can use around advice
     @Around(" com.example.springaop.aspect.CommonJoinPointConfig.businessMethods()")
     public Object calculateExecutionTime(ProceedingJoinPoint jointPoint) throws Throwable
     {
         long startTime = System.currentTimeMillis();
         Object result = jointPoint.proceed(); // Proceed with the method execution
         long endTime = System.currentTimeMillis();
         long executionTime = endTime - startTime; // Calculate the execution time
         System.out.println("Method " + jointPoint.getSignature() + " executed in " + executionTime + " ms");
         return result; // Return the result of the method execution
     }
    @Around(" com.example.springaop.aspect.CustomAnotation.trackTimeAnnotation()")
    public Object TrackTimeforCustomAnotation(ProceedingJoinPoint jointPoint) throws Throwable
    {
        long startTime = System.currentTimeMillis();
        Object result = jointPoint.proceed(); // Proceed with the method execution
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(" we use custom anotation to track time");
        System.out.println("Method " + jointPoint.getSignature() + " executed in " + executionTime + " ms");
        return result; // Return the result of the method execution
    }



}
