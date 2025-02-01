package com.kodtodya.bank.model;

public class BasicSavingsAccount extends SavingsAccount {
    boolean isZeroBalanceAccount;
    int withdrawalLimit;

    public boolean isZeroBalanceAccount() {
        return isZeroBalanceAccount;
    }

    public void setZeroBalanceAccount(boolean zeroBalanceAccount) {
        isZeroBalanceAccount = zeroBalanceAccount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BasicSavingsAccount{" +
                "isZeroBalanceAccount=" + isZeroBalanceAccount +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", withdrawalLimit=" + withdrawalLimit +
                ", accountNo=" + accountNo +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
