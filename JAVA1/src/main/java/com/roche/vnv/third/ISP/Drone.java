package com.roche.vnv.third.ISP;
//la clase drone hereda de la clase padre Vehicle
public class Drone extends Vehicle implements SwitchCamera {  //switchEngine ya lo hace el padre, no hace falta implementar la interface

    @Override
    public void turnCameraOn() {

    }

    @Override
    public void turnCameraOff() {

    }
}
