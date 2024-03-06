package br.com.devfelipebemvindo.aulas.arrays.oop;

public class ArraysOOP {

    public static void main (String args[]){
        //Criando um vetor ou (coleção/conjunto de usuários) dinâmico com infinitas possibilidades de usuários para fazer login
        TesteArraysOOP[] user = new TesteArraysOOP[]{
                new TesteArraysOOP("Felipe"),
                new TesteArraysOOP("Matheus"),
                new TesteArraysOOP("Ferreira"),
                new TesteArraysOOP("Bemvindo")
        };

        System.out.println(user[0].getNome());
        System.out.println(user[3].getNome());
    }
}
