package com.roche.vnv.third.Bad;
//OCP (Open Close Principle):
//1. Create a class Result with attributes: String value1, String value2
//2. Create an enum ResultType containing ie REGULAR, CALCULATED, EMBBEDED, CALIBRATOR, AON
//3. Create a class ResultHandler handling above ResultType: depending on the ResultType assign different (random) values

public class Result {

    private final String value1, value2; // objeto (solo se accede haciendo new Result)-- al poner final no te deja crear setters (siempre utilizar la palabra final para los atributos)
    //private static final ResultType resultType = new ResultType(); (no pinta nada aquí)//clase (se accede result. )

    public Result(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

}



