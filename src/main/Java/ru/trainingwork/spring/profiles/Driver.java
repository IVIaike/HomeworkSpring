package ru.trainingwork.spring.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Driver {
    private String name;
    @Autowired
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Driver " + name + " is arrived. " + transport;
    }
}
