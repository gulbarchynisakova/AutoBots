package com.autobots.lava.bankAppication;

public class MBank extends BankBase{

private double balanse = 200;
    public MBank(long accountNumber, long routingNumber) throws Exception {
        super(accountNumber, routingNumber);
        addToAllBankRecords(this);
    }

    @Override
    public double getBalance() {
        return balanse;
    }

    @Override
    public void deposit(double ammount) {
    if (ammount<0 || ammount > 200000){
        throw new IllegalArgumentException("Invalid ammount can not be deposit");
    }
    balanse += ammount;
    }

    @Override
    public void withDraw(double ammount) {
    if (ammount<0 || ammount > 150000){
        throw new IllegalArgumentException("Invalid ammount cao not be withDraw");
    } else {
        if (ammount>balanse){
            throw new IllegalArgumentException("Insufficient funds");
        } else {
            balanse -=ammount;
        }
    }
    }
}
