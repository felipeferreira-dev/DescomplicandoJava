package br.com.devfelipebemvindo.aulas.sobrescrita;

import br.com.devfelipebemvindo.meusprojetos.teladelogin.User;

public class ToString {

    public static void main(String[] args) {
        User user = new User("Felipe", "123456");

        // Chamando o metodo sobescrito de toString para me devolver as informações já formatadas do objeto User
        System.out.println(user.toString());
    }
}
