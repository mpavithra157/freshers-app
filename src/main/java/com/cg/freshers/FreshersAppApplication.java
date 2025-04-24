package com.cg.freshers;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class FreshersAppApplication {
 
    public static void main(String[] args) {
SpringApplication.run(FreshersAppApplication.class, args);
 
        // Create an object of your custom class and test it
		DerivedData data = new DerivedData();
        data.init();
        data.validateOperator("25", "20", "greater than");  // Example test
    }
}