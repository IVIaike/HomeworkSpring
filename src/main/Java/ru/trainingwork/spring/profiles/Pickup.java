package ru.trainingwork.spring.profiles;

import org.springframework.stereotype.Component;

@Component
public class Pickup extends Transport{

    private String name;
    private BodyType bodyType;

    public Pickup(String name, BodyType bodyType) {
        this.name = name;
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return bodyType + " ready to work!";
    }
}
