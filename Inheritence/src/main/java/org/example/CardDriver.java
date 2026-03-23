package org.example;

import javax.security.auth.login.CredentialException;

class card{
    String name ;
    int cardNum;
    String cvv;
    String exp;
}

class creditCard extends card{
    long limit;
    public void swipe(){
        System.out.println("Paid bu using credit card");
    }
    public void display(){
        System.out.println(name);
        System.out.println(cardNum);
        System.out.println(cvv);
        System.out.println(limit);
        System.out.println(exp);
    }
}
class DebitCard extends card{
    long bal;
}
public class CardDriver {
    public static void main(String[] args) {
        creditCard c = new creditCard();
        c.name ="ICICI-CreditCard";
        c.cardNum =87654321;
        c.exp = "12/2030";
        c.cvv = "ICICI1001";
        c.limit = 1500000;
        c.swipe();
        c.display();
    }
}
