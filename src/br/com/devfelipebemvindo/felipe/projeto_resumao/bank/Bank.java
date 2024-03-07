package br.com.devfelipebemvindo.felipe.projeto_resumao.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String ag;
    private int lastAccount;

    private List<Account> accounts;

    public Bank(String ag) {
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    public Account bankGenerateAccount(String name) {
        lastAccount = (int) Math.floor(Math.random() * 100); // gerando um numero aleatório para a conta
        return new Account(ag, "" + lastAccount, name);
    }

    public void insertAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public double outputTotal() {
        double total = 0;

        for (Account account : accounts) {
            double balance = account.getBalance();
            total += balance;
        }

        return total;
    }
}
