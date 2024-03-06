package br.com.devfelipebemvindo.aulas.sobrescrita;

import br.com.devfelipebemvindo.teladelogin.User;

public class SobrecargaMetodos {

    public static void main(String[] args) {
        User user = new User("Felipe", "123456");

        // Sobrecarga de metodo
        // realizando a chamada do metodo com mesmo nome, mas com assinatura e operação diferentes
        System.out.println(user.output());
        System.out.println(user.output(false));
    }
}
