package org.example;

class Bank{
    int rateOfInt(){
        return 0;
    }
}
class SBI extends Bank{
    int rateOfInt(){
        return 11;
    }
}
class ICICI extends Bank{
    protected int rateOfInt(){
        return 12;
    }
}
class Axis extends Bank{
    public int rateOfInt(){
        return 10;
    }
}

public class BankDriver {
    public static void main(String[] args) {
        Bank b = new Bank();
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();

        System.out.println("Bank of rate of Interest is"+ b.rateOfInt());
        System.out.println("SBI Bank of rate of Interest is"+ s.rateOfInt());
        System.out.println("ICICI Bank of rate of Interest is"+ i.rateOfInt());
        System.out.println("Axis Bank of rate of Interest is"+ a.rateOfInt());
    }
}
