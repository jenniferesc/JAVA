package com.roche.vnv.third.Good;

public class AONResultCreator implements ResultCreator{
    @Override
    public ResultGood create() {
        return new ResultGood("1","2");
    }
}
