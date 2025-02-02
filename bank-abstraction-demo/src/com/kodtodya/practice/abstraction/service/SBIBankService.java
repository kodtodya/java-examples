package com.kodtodya.practice.abstraction.service;

public class SBIBankService extends BankService {

    @Override
    public void disburseLoan() {
        System.out.println("Loan iss being disbursed in SBI style!!");
    }

    @Override
    public void openAccount() {
        System.out.println("Account opened by SBI bank!!!");
    }
}
