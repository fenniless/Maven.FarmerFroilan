package com.zipcodewilmington.froilansfarm.person;

public class Rider extends PersonDecorator{

    private Personable core;

    public Rider(Personable inner) {
        core = inner;
    }

    public Personable getCore() {
        return core;
    }

    public void mount(Rideable obj) {
        obj.ride();
    }

    public void dismount(Rideable obj) {
        obj.ride();
    }
}
