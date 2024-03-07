package br.com.devfelipebemvindo.felipe.projeto_resumao.bank;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String args[]) {
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        Log logger = new Log();

        Bank santander = new Bank("0001");
        Account account;

        // Criando um looping para criar contas
        while (!isExit) {

            logger.print("Digite -> C (Criar Conta) | SAIR (finalizar)");
            String c = scanner.nextLine(); // capturando texto

            switch (c.toUpperCase()) {
                case "C" -> {
                    logger.print("Digite seu nome: ");
                    String name = scanner.nextLine();

                    account = santander.bankGenerateAccount(name); // Gerando uma nova conta no banco
                    santander.insertAccount(account); // Inserindo a nova conta na lista de contas do banco

                    managementAccount(scanner, logger, account, isExit); // Gerenciando a conta

                    scanner = new Scanner(System.in); // reinicia o scanner para evitar exibir a mensagem 2 vezes
                }

                case "SAIR" -> isExit = true;

                default -> logger.print("Comando inválido! Tente novamente.");
            }
        }

        // Apos finalizar, recupero a lista de contas cadastradas
        List<Account> listAccounts = santander.getAccounts();

        // Exibo no terminal os dados das contas
        for (Account acc : listAccounts) {
            logger.print(acc.toString());
        }

        // Imprimindo o valor total de todas as contas somadas
        logger.print("\nTOTAL CAIXA: R$ " + santander.outputTotal());
    }

    private static void managementAccount(Scanner scanner, Log logger, Account account, boolean isExit) {
        while (!isExit) {
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
                    isExit = true;
                }
                default -> {
                    logger.print("Comando inválido!");
                }
            }

            scanner = new Scanner(System.in);
        }
    }
}

