package com.example.springaop;

import com.example.springaop.bussines.Bussines1;
import com.example.springaop.bussines.Bussines2;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);

    @Autowired
    private Bussines1 bussines1;
    @Autowired
    private Bussines2 bussines2;

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // This method can be used to execute code after the application context is loaded
        // For example, you can initialize some data or run some tests here
        System.out.println("Spring AOP Application has started successfully!");
        logger.info("Bussines1 Data: {}", bussines1.getData());
        logger.info("Bussines2 Data: {}", bussines2.getData());

//        System.out.println("Running Bussines1 with exception...");
//        logger.info("Bussines1 Data with exception: {}", bussines1.getDataWithException());


    }
}
