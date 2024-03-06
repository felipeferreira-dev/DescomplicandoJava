package br.com.devfelipebemvindo.aulas.arrays.dinamico;

import br.com.devfelipebemvindo.meusprojetos.teladelogin.User;

import java.util.ArrayList;
import java.util.List;

public class ListDinamico {

    public static void main(String[] args) {
        // List -> Utilizado quando não sabemos o tamanho da lista que iremos trabalhar
        // ArrayList e List -> Não possuem tamanho fixo, elas crescem conforme formos adicionando mais itens
        List<User> users = new ArrayList<>();

        int i = 0;
        while (i < 10) {
            User usuario = new User("Nome: " + i, " Senha: " + i);
            users.add(usuario);
            i++;
        }

        System.out.println(users.get(0).getLogin() + " " + users.get(0).getPassword());

        // Posso acrescentar mais itens na lista infinitamente
        users.add(new User("Felipe", "123456"));
        System.out.println(users.get(10).getLogin() + " " + users.get(10).getPassword());
    }

}
