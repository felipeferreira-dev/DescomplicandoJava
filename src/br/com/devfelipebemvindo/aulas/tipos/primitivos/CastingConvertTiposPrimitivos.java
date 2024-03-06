package br.com.devfelipebemvindo.aulas.tipos.primitivos;

import java.util.Scanner;

public class CastingConvertTiposPrimitivos {

    // USADO PARA ECONOMIZAR tipos primitivos podendo usar a mesma variável para varios tipos;
    public static void main(String args[]) {
        //converter tipos primitivos
        //(casting)

        Scanner scanner = new Scanner(System.in);
//         fazendo o casting, convertendo o resultado de double para int
//        int z = (int) scanner.nextDouble();
//        System.out.println(z);

        //se eu não colocar o "(int)" ele entende que o scanner.nextDouble() esta tentando atribuir um valor double para
        //a variável INT x, por isso dá erro nesse codigo da linha 20;
//        int x = scanner.nextDouble();


        //exemplo transformando double em int
        double dd = 1997.10;
        int anoNascimeto = (int) dd;
        System.out.println("Nascimento: " + anoNascimeto);
    }
}
