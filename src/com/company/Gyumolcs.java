package com.company;

public class Gyumolcs {
    private String fajta;
    private String iz;

    public Gyumolcs(String f, String i) {
        this.fajta = f;
        this.iz = i;
    }

    public String milyenFajtaju() {
        return this.fajta;
    }

    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public String toString() {
        return "gyumolcsfajta: " +fajta+ ", gyumolcsiz: " +iz;
    }
}
