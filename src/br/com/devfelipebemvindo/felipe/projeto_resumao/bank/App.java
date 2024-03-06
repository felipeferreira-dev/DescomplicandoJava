package br.com.devfelipebemvindo.felipe.projeto_resumao.bank;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String args[]) {
        boolean isExit = true;
        Scanner scanner = new Scanner(System.in);
        Log logger = new Log();

        Bank santander = new Bank("0001");
        Account account;

        while (isExit) {

            logger.print("Digite -> C (Criar Conta) | SAIR (finalizar)");
            String c = scanner.nextLine();

            if (c.toUpperCase().equals("C")) {
                logger.print("Digite seu nome: ");
                String name = scanner.nextLine();
                account = santander.generateAccount(name);
                santander.insertAccount(account);

                generateAccount(scanner, logger, account, isExit);

                scanner = new Scanner(System.in);
            } else if (c.toUpperCase().equals("SAIR")) {
                isExit = false;
                break;
            } else
                logger.print("Comando inválido! Tente novamente.");
        }

        List<Account> listAccounts = santander.getAccounts();
        for (Account acount : listAccounts) {
            logger.print(acount.toString());
        }

        santander.outputTotal();
    }

    private static void generateAccount(Scanner scanner, Log logger, Account account, boolean isExit) {
        while (isExit) {
            logger.print("Digite -> D (deposito) | S (saque) | SAIR (finalizar)");
            String operation = scanner.nextLine();

            switch (operation.toUpperCase()) {
                case "D" -> {
                    logger.print("Valor a Depositar R$ ");
                    account.deposit(scanner.nextDouble());
                }
                case "S" -> {
                    logger.print("Valor a Sacar R$ ");
                    account.withDrow(scanner.nextDouble());
                }
                case "SAIR" -> {
                    isExit = false;
                }
                default -> {
                    logger.print("Comando inválido!");
                }
            }

            scanner = new Scanner(System.in);
        }
    }
}

