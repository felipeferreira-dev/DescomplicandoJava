package br.com.devfelipebemvindo.felipe;

import javax.swing.*;

public class ClasseMain {
    // Metodo static void main = quer dizer que é a classe principal do projeto, é aqui que tudo sera executado
    // Sem a classe main, não consigo executar o projeto!
    public static void main(String[] args){
        // var é o novo tipo de dado aceito nas novas versões do java! ele converte qualquer dado como Int, String boolean, etv.
        var login = "felipe";
        var password = 123;
        int number = 2;

        // Try = tente fazer isso...
        try{
            number = number/0;

          //catch (capture o que o try tentou fazer e mostre o erro se necessário).
        } catch(Exception e){
            System.out.println("\n\nErro divisao por zero: " + e.fillInStackTrace());
        }                                                   //fillInStackTrace() = mostra qual foi o erro gerado!

        System.out.println("\n" + login + " | " +password + " | " + number);

    }
}
