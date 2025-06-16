package com.example.springaop.aspect;

import com.example.springaop.SpringAopApplication;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);
     /// we call the join point config to get the pointcut expression
    @AfterReturning(value = "com.example.springaop.aspect.CommonJoinPointConfig.businessMethods()",
            returning = "result"
    )
    // This advice will be executed after any method in the bussines package
    public void logAfterMethodExecution(JoinPoint joinPoint , Object result) {
        // This advice will be executed after any method in the bussines package

        logger.info("Method in bussines1 class  executed: {} and return {}", joinPoint, result);
        // You can add more logic here, such as logging the result or performing cleanup actions
    }
     /// this is traditional joint point
    @AfterThrowing(value ="execution(* com.example.springaop.bussines..*(..))"
            , throwing = "exception"
    )
    // This advice will be executed after any method in the bussines package throws an exception
    public void logAfterMethodThrowing(JoinPoint joinPoint, Throwable exception) {
        // This advice will be executed after any method in the bussines package throws an exception
        logger.error("Method in bussines1 class  executed: {} and throw exception {}", joinPoint, exception.getMessage());
        // try to exctete alrenative code or cleanup actions
        System.out.println("we have an exception in the bussines1 class, we will try to execute alternative code");
        // we do this to log the exception  and exit gracefully
    }

}
