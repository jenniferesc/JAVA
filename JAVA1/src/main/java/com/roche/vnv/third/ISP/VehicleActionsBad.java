package com.roche.vnv.third.ISP;
//se deberian hacer tantas interfaces como objetos que tienen que implementar ya que drone y car no comparten el turnRadioOn, solo una de ellas tendrá radio así que se divide esta interfaz en varias más pequeñas
public interface VehicleActionsBad {
    void startEngine();
    void shutdownEngine();
    void turnRadioOn();
    void turnRadioOff();
    void turnCameraOn();
    void turnCameraOff();
}
