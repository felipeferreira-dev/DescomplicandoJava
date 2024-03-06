package br.com.devfelipebemvindo.aulas.arrays.oop;

public class TesteArraysOOP {

    public String nome;

    public TesteArraysOOP(String nome){
        this.nome = nome.toUpperCase();;
    }

    public String getNome(){ return nome; }

    public void setNome (String nome){
        nome = nome.toUpperCase();
        this.nome = nome;
    }
}
