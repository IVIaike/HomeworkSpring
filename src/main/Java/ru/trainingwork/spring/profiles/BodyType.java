package ru.trainingwork.spring.profiles;

public enum BodyType {
    CAR ("Сar"),
    BUS ("Bus"),
    PICKUP ("Pickup");

    private String type;

    BodyType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
