package com.roche.vnv.Fourth.DIP;

import java.util.Random;

public class DeploymentTracker{
    //programación funcional mejor que no imperativa
    private final Email email;
    private final Phone phone;

    public DeploymentTracker (Email email, Phone phone){
        this.email=email;
        this.phone=phone;
    }

    public void deploy(String buildNumber){

        boolean deployed;

        /**
         * Perfom some magic with the build ie: download it
         */

        deployed = new Random().nextBoolean();

        if (deployed) {
            email.sendNotification("Congrat!The build " + buildNumber + " has been succesfully deployed.RIP");
        }
        else{
            phone.sendNotification("Upppps! The build " + buildNumber + " has not been succesfully deployed. Fix it ASAP");
        }
    }

}
