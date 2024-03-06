package br.com.devfelipebemvindo.aulas;

public class Escopo {
    public static void main (String args[]){
        //UM ESCOPO é o local definido pelas chaves {}

        /*
        // para utilizar uma variável sem escopo preciso fazer o seguinte:
        int x;
        if (true){
            x = 10;
        }
        System.out.println(x); // aqui eu consigo chamar a variável, pois não esta dentro do escopo, ou seja tenho acesso a
                               // essa variavel de qualquer lugar dentro do meu main(String args[]).
        */



        //VARIAVEL DENTRO DO ESCOPO = util para economizar espaço de armazenamento. a variavel funciona somente dentro do escopo, fora dele ela morre!
        if (true){
            int x = 10; // variável local (aqui está dentro de um escopo, ou seja só vai funcionar dentro desta função!!!)
        }
        // System.out.println(x); // se eu tentar chamar a variável fora do escopo, da erro! Eu não consigo fazer isso!!!
    }
}
