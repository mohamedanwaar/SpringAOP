package com.example.springaop.aspect;

import com.example.springaop.SpringAopApplication;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);
    // Define pointcuts and advices here
    // For example, you can log method execution, handle exceptions, etc.
    // Example of a pointcut that matches all methods in the bussines package


    /// this method will be executed before any method in the bussines package
    @Before("com.example.springaop.aspect.CommonJoinPointConfig.businessMethods()")
    public void logBeforeMethodExecution( JoinPoint joinPoint)  {
        ///this cald advice
        /// this is an advice that will be executed before any method in the bussines package
        logger.info("check for user access before method execution");
        ///You can add more logic here, such as checking user roles, permissions, etc.
        logger.info("allowed access for  {}", joinPoint);
    }


    /// here we make lojging using custom annotation
    @Before("com.example.springaop.aspect.CustomAnotation.loggingAnnotation()")
    public void logBeforeMethodExecutionWithCustomAnnotation(JoinPoint joinPoint) {
        /// this is an advice that will be executed before any method in the bussines package
        logger.info("check for user access before method execution with custom annotation");
        /// You can add more logic here, such as checking user roles, permissions, etc.
        logger.info("allowed access for  {}", joinPoint);
    }

}
