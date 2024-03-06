package br.com.devfelipebemvindo.aulas.algoritmos;

public class FuncoesVariaveisCalc {

    //Funcoes e Variaveis e Parâmetros = como funciona um método
    public static void main(String[] args){

    int number1 = 2, number2 = 2;

    //Chamando e executando os métodos criados
    soma(number1, number2);
    subtracao(number1, number2);
    divisao(number1, number2);
    multiplicacao(number1, number2);
    }

    // Criando métodos:

                    //Parametros = (int xxxxx)
    static void soma(int number1, int number2){

        System.out.println(number1 + number2);
    }

    static void subtracao(int number1, int number2){

        System.out.println(number1 - number2);
    }

    // Método com try catch para capturar o erro da divisão por 0
    static void divisao(int number1, int number2){
        try{
            System.out.println(number1/number2);
        } catch (Exception e){
            System.out.println("Proibido dividir qualquer valor por 0");
        }
    }

    static void multiplicacao(int number1, int number2){

        System.out.println(number1 * number2);
    }
}
