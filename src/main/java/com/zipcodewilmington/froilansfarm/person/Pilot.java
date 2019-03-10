package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.equipmentAndStructures.Aircraft;

public class Pilot extends PersonDecorator {

    private boolean airborne;

    private Personable core;

    public Pilot(Personable inner) {
        core = inner;
        airborne = false;
    }

    public Personable getCore() {
        return core;
    }

    public void fly(Aircraft aircraft) {
        airborne = true;
    }

    public void land(Aircraft aircraft) {
        airborne = false;
    }

    public boolean getAirborne() {
        return airborne;
    }
}
