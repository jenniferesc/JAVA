package com.roche.vnv.Second.srp;

public class Lot implements Printable{

    private String lotNumber;
    private String controlName;
    private String supplier;

    public Lot(String lotNumber, String controlName, String supplier) {
        this.lotNumber = lotNumber;
        this.controlName = controlName;
        this.supplier = supplier;
    }


    public String getControlName() {
        return controlName;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public String getSupplier() {
        return supplier;
    }

    public String print() {
        return lotNumber;
    }
    public static void main(String[] args) {
        Lot lot = new Lot(null, null, null);
        final ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.output(lot);
    }

}

interface Printable {
    String print();
}

class ConsolePrinter {
    void output(Printable printable){
        System.out.println(printable.print());
    }
}

class ApiPrinter {
     void output(Printable printable) {
         System.out.println(printable.print() + "others");
     }
}

//class Test {

    //public static void main(String[] args) {
     //   Lot lot = new Lot();
     //   lot.setLotNumber("123-123-123");
  //  }
//}