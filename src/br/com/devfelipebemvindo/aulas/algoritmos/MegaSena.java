package br.com.devfelipebemvindo.aulas.algoritmos;

import java.util.Random;

public class MegaSena {

    public static void main(String[] args){

        int i = 0;
        //Chamando a classe Random, para gerar numeros aleatórios
        Random genereted = new Random();

        //Conceito de while = enquanto();
        /*while(i < 6){
            //Next int = proximo número
            int number = genereted.nextInt(60);
            System.out.println(number);
            i = i+1;
        }*/

        //Conceito de for = para();
        for(i = 0; i<6; i++){
            //Next int = proximo número
            int number = genereted.nextInt(60);
            System.out.println(number);

        }
    }
}
