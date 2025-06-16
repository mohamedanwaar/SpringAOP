package com.example.springaop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomAnotation {
    // This aspect can be used to define custom annotations and their behavior.
    // For example, you can create an annotation that logs method execution time or handles exceptions.

    @Pointcut("@annotation(com.example.springaop.aspect.traketime)")
    public void trackTimeAnnotation() {
        // This pointcut matches methods annotated with @traketime.
    }

    @Pointcut("@annotation(com.example.springaop.aspect.Logging)")
    public void loggingAnnotation() {
        // This pointcut matches methods annotated with @Logging.
    }
}
