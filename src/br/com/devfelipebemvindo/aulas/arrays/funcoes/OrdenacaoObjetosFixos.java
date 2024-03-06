package br.com.devfelipebemvindo.aulas.arrays.funcoes;

import java.util.Arrays;

public class OrdenacaoObjetosFixos {

    public static void main(String[] args) {
        // Ordenando arrays fixos -> Arrays.sort()
        int[] numbers = new int[]{100, 22, 50, 1, 45, 22, 10};

        // TODO: 06/03/2024 Arrays.sort() 
        Arrays.sort(numbers);
        System.out.println(numbers); // Fazendo dessa forma eu consigo imprimir um (HashCode int[] -> identificador) do objeto tipo um ID

        // Varrendo a coleção para imprimir cada elemento (conteúdo) através do seu índice.
        // Da pra fazer isso via while, for, ou usando o toString -> transforma o objeto em String para realizar a impressão
        // TODO: 06/03/2024 Arrays.toString() 
        System.out.println(Arrays.toString(numbers));
    }
}
