package org.example;

import javax.swing.plaf.PanelUI;

interface Payable{
    void Pay();
}
class UPI implements Payable{
    @Override
    public void Pay() {
        System.out.println("Paid by using UPI");
    }
}
class CreditCard implements Payable {
    @Override
    public void Pay() {
        System.out.println("Paid by using CreditCard");
    }
}
class NetBank implements Payable{
    @Override
    public void Pay() {
        System.out.println("Paid by using NeyBank");
    }
}

public class PayDriver {
    public static void sent(Payable p){
        p.Pay();
    }
    public static void main(String[] args) {
        sent(new CreditCard());
    }
}
