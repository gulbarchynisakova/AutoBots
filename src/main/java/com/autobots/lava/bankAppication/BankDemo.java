package com.autobots.lava.bankAppication;

public class BankDemo {
    public static void main(String[] args) throws Exception {
        MBank aliiaMBank = new MBank(123456789111L,444444444);

        System.out.println(aliiaMBank.getBalance());
        aliiaMBank.deposit(100000);
        System.out.println("_______");

        Optima ulugbekOptima = new Optima(123456789122L,555555555);

        Bank.transferFunds(aliiaMBank,ulugbekOptima,500);
        System.out.println(aliiaMBank.getBalance());
        System.out.println(ulugbekOptima.getBalance());
    }
}
