package ru.trainingwork.spring.profiles;

public abstract class Transport {
    private String name;
    private BodyType bodyType;

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
        return "Transport{" +
                "name='" + name + '\'' +
                ", bodyType=" + bodyType +
                '}';
    }
}
