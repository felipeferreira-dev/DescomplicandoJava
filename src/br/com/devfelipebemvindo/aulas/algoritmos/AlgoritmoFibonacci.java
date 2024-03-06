package br.com.devfelipebemvindo.aulas.algoritmos;

import java.util.Scanner;

public class AlgoritmoFibonacci {

    public static void main(String[] args) {
        // Exercício de repetição de While, if, else, Scanner, etc..
        // 0 + 1 = 2 .. 1 + 2 == 3 .. 2 + 3 = 5..

        Scanner input = new Scanner(System.in);

        int f1 = 0, f2 = 1;
        int limit = input.nextInt();

        while (f2 < limit) {
            int fn = f1 + f2;

            if (fn > limit)
                break;

            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }
    }
}
