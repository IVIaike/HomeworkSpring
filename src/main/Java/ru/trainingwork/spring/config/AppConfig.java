package ru.trainingwork.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import ru.trainingwork.spring.profiles.*;

@Configuration
public class AppConfig {
    @Bean("transport1")
    @Primary
    public Car getCarBean () {
        return new Car("Audi", BodyType.CAR);
    }
    @Bean("transport2")
    public Bus getBusBean () {
        return new Bus("Ikarus", BodyType.BUS);
    }
    @Bean("transport3")
    public Pickup getPickupBean () {
        return new Pickup("UAZ", BodyType.PICKUP);
    }

    @Bean("driver1")
    @Scope(scopeName = "prototype")
    public Driver driver1(){
        return new Driver("Alex", getCarBean());
    }
    @Bean("driver2")
    @Scope(scopeName = "prototype")
    public Driver driver2() {
        return new Driver("Max", getBusBean());
    }
    @Bean("driver3")
    @Scope(scopeName = "prototype")
    public Driver driver3 () {
        return new Driver("Gene", getPickupBean());
    }

}
