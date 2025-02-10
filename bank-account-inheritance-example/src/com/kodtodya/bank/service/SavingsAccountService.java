package com.kodtodya.bank.service;

import com.kodtodya.bank.model.Account;
import com.kodtodya.bank.model.SavingsAccount;
import com.kodtodya.bank.repository.SavingsAccountRepository;

public class SavingsAccountService extends AccountService {

    SavingsAccountRepository savingsAccountRepository = new SavingsAccountRepository();

    public double calculateInterest(SavingsAccount account) {
       return savingsAccountRepository.calculateInterest(account);
    }
}
