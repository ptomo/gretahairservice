package com.byop.gretahairservice.valueobject;

public class Dummy {

    private final long id;
    private final String name;

    public Dummy(long id, String name) {
        this.id= id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
