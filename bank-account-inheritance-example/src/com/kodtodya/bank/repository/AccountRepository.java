package com.kodtodya.bank.repository;

import com.kodtodya.bank.model.Account;

import java.util.HashSet;
import java.util.Set;

public class AccountRepository {
    Set<Account> accounts = new HashSet<>();

    public Account openAccount(Account account) {
        accounts.add(account);
        return account;
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public void closeAccount(int accountNumber) {
        Account accountToBeClosed = null;
        for(Account account : accounts) {
            if (account.getAccountNo() == accountNumber)  {
                accountToBeClosed = account;
            }
        }
        accounts.remove(accountToBeClosed);
    }

    public Account getAccount(int accountNumber) {
        for(Account account : accounts) {
            if (account.getAccountNo() == accountNumber)  {
                return account;
            }
        }
        return null;
    }

    public Set<Account> getAllAccounts() {
        return accounts;
    }
}
