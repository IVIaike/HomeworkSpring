package ru.trainingwork.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.trainingwork.spring.config.AppConfig;
import ru.trainingwork.spring.profiles.*;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

//        Transport transport1 = context.getBean("transport1", Car.class);
//        System.out.println(transport1);
//
//        Transport transport2 = context.getBean("transport2", Bus.class);
//        System.out.println(transport2);
//
//        Transport transport3 = context.getBean("transport3", Pickup.class);
//        System.out.println(transport3);


        Driver driver1 = context.getBean("driver1", Driver.class);
        System.out.println(driver1);

        Driver driver2 = context.getBean("driver2", Driver.class);
        System.out.println(driver2);

        Driver driver3 = context.getBean("driver3", Driver.class);
        System.out.println(driver3);

    }
}
