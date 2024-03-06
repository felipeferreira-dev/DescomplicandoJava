package br.com.devfelipebemvindo.aulas.arrays.funcoes;

import java.util.Arrays;

public class PreenchendoArrays {

    public static void main(String[] args) {
        String[] names = new String[10]; // Lista vazia, com 10 espaços nulos alocados
        System.out.println(Arrays.toString(names));

        // TODO: 06/03/2024 Arrays.fill() 
        // fill -> Pré preenchendo minha lista com valores padrão (default) pode ser útil em testes
        Arrays.fill(names, "Olá");
        System.out.println(Arrays.toString(names));
    }
}
