package br.com.devfelipebemvindo.felipe.projeto_resumao.bank;

public class Account {

    private String ag;
    private String cc;
    private String name;

    private double balance;
    private Log logger = new Log();

    private static final int MAX_LENGHT = 12;

    public Account(String agency, String account, String name) {
        this.ag = agency;
        this.cc = account;
        setName(name);
        logger.print("SALDO ATUAL: R$ " + getBalance());
    }

    public void setName(String name) {
        if (name.length() > MAX_LENGHT)
            this.name = name.substring(0, 15);
        else
            this.name = name;

        System.out.println("Nome: " + this.name);
    }

    public void withDrow(double value) {
        if (value <= 0) {
            logger.print("Valor inválido para saque! Tente outra vez.");
            return;
        }

        if (balance < value) {
            logger.print("Você não possui saldo suficiente para sacar! - Saldo atual: R$ " + getBalance());
            return;
        }

        this.balance -= value;
        logger.print("Você sacou: R$ " + value + " - Saldo atual: R$ " + getBalance());
    }

    public void deposit(double value) {

        if (value <= 0)
            logger.print("Valor inválido para depósito! Tente outra vez.");
        else {
            this.balance += value;
            logger.print("Depositou: R$ " + value);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "\nA conta:" +
                " " + name +
                " | " + ag +
                " | " + cc +
                "\nPossui saldo de = R$" + balance + "!";
    }
}
