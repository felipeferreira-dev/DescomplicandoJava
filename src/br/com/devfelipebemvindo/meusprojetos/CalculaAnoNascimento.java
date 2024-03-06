package br.com.devfelipebemvindo.meusprojetos;

import java.util.Scanner;

public class CalculaAnoNascimento {
    public static void main(String[] args){

        int anoNascimeto, anoAtual;

        // Scanner é usado para inputar dados via linha de comando.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite seu nome: ");
        // scanner.nextline() = este método espera que o úsuario inpute(escreva) o dado do tipo texto
       String name = scanner.nextLine();

       System.out.println("Olá, " + name);

       System.out.println("\nDigite o seu ano de nascimento: ");
       anoNascimeto = scanner.nextInt();

       System.out.println("\nDigite o ano atual: ");
       anoAtual = scanner.nextInt();

       System.out.println("\nOk Sr. "+name);
       idade(anoAtual, anoNascimeto);

    }

    static void idade(int anoAtual, int anoNascimento){
        System.out.println("Sua idade é: " + (anoAtual-anoNascimento) + " anos!");
    }
}
