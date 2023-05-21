package ru.trainingwork.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import ru.trainingwork.spring.profiles.*;

@Configuration
public class AppConfig {
    @Bean("car")
    public Car getCarBean () {
        return new Car("Audi", BodyType.CAR);
    }
    @Bean("bus")
    public Bus getBusBean () {
        return new Bus("Ikarus", BodyType.BUS);
    }
    @Bean("pickup")
    public Pickup getPickupBean () {
        return new Pickup("UAZ", BodyType.PICKUP);
    }
    @Bean("carDriver")
    public Driver getCarDriverBean(){
        return new Driver("Alex", getCarBean());
    }
    @Bean("busDriver")
    public Driver getBusDriverBean() {
        return new Driver("Max",getBusBean());
    }
    @Bean("pickupDriver")
    public Driver getPickupDriverBean () {
        return new Driver("Gene", getPickupBean());
    }

}
