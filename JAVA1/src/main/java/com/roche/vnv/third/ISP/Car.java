package com.roche.vnv.third.ISP;
//extends es que hereda los métodos del padre Vehicle
public class Car extends Vehicle implements SwitchRadio, SwitchCamera{

    @Override
    public void turnRadioOn() {
        System.out.println("yes");
    }

    @Override
    public void turnRadioOff() {
        System.out.println("yes");
    }

    @Override
    public void turnCameraOn() {
        System.out.println("yes");
    }

    @Override
    public void turnCameraOff() {
        System.out.println("yes");
    }
}
