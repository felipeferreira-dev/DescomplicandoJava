package br.com.devfelipebemvindo.felipe.projeto_resumao.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String ag;
    private int lastAccount = 1;

    private List<Account> accounts;

    public Bank(String ag) {
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    public Account generateAccount(String name) {
        Account account = new Account(ag, "" + lastAccount, name);
        lastAccount = (int) Math.floor(Math.random() * 100); // gerando um numero aleatório para a conta
        return account;
    }

    public void insertAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void outputTotal() {
        double total = 0;

        for (Account account : accounts) {
            double balance = account.getBalance();
            total += balance;
        }

        System.out.println("\nTOTAL CAIXA: R$ " + total);
    }
}
