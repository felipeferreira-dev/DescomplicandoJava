package br.com.devfelipebemvindo.aulas.arrays.funcoes;

import java.util.Arrays;

public class ComparandoArrays {

    public static void main(String[] args) {
        // Comparando arrays -> dois possuem o mesmo conteúdo, porém alocados em espaço de memória diferente
        int[] numbersA = new int[]{1, 2, 3};
        int[] numbersB = new int[]{1, 2, 3};

        System.out.println(numbersA == numbersB); // false pois o '==' compara o endereço alocado na memória
        System.out.println(numbersA.equals(numbersB)); // false
        System.out.println(numbersA + " " + numbersB); // imprimindo o hashCode (ID)

        // TODO: 06/03/2024 Arrays.equals() 
        System.out.println(Arrays.equals(numbersA, numbersB)); // true Aqui sim eu estou comparando o conteúdo do array
    }
}
