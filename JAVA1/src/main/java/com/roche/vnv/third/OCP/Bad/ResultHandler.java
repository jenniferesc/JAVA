package com.roche.vnv.third.OCP.Bad;

public class ResultHandler {

    public Result handle(ResultType resultType){
        switch (resultType){
            case AON:
                return new Result("1","2");
            case REGULAR:
                return new Result("3","4");
            default:
                break;

        }
        return null;
    }
}
//código malo, no se deben usar ni if else ni switch porque se tendrían que cambiar las clases, buscamos no cambiar clases solo añadir cosas(que sean extensibles)
// al identificar switch o else if se crea la interface CREATOR (ResultCreator)