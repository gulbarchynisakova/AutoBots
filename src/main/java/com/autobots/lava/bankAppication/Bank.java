package com.autobots.lava.bankAppication;

public interface Bank {

    double getBalance();
    void deposit(double ammount);
    void withDraw(double ammount);

    static void transferFunds(Bank sender, Bank resipient,double transferAmmount){
        sender.withDraw(transferAmmount);
        resipient.deposit(transferAmmount);
    }
}
