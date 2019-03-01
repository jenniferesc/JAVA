package com.roche.vnv.third.Good;

public class REGULARResultCreator implements ResultCreator {
    @Override
    public ResultGood create() {
        return new ResultGood("3","4");
    }
}
