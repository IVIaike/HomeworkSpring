package ru.trainingwork.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.trainingwork.spring.config.AppConfig;
import ru.trainingwork.spring.profiles.*;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Transport car = context.getBean("car", Car.class);
        System.out.println(car);

        Transport bus = context.getBean("bus", Bus.class);
        System.out.println(bus);

        Transport pickup = context.getBean("pickup", Pickup.class);
        System.out.println(pickup);


        Driver carDriver = context.getBean("carDriver", Driver.class);
        System.out.println(carDriver);

        Driver busDriver = context.getBean("busDriver", Driver.class);
        System.out.println(busDriver);

        Driver pickupDriver = context.getBean("pickupDriver", Driver.class);
        System.out.println(pickupDriver);

    }
}
