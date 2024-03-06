package br.com.devfelipebemvindo.aulas.arrays.fixo;

import br.com.devfelipebemvindo.teladelogin.User;

public class ArrayLocalConteudoFixo {

    public static void main(String[] args) {
        // Vetores/Coleções são utilizadas quando já sabemos o tamanho específico que a lista terá ou seja quando preenchemos manualmentre a lista
        // Ex.: Uma lista de países da américa do sul (dificilmente será criado um novo País, portanto podemos criar uma lista de tamanho fixo)
        // Caso 1 criando um Array (tamanho) dinâmico, porém com conteúdo fixo
        String[] user = new String[]{
                new String("Felipe"),
                new String("Matheus"),
                new String("Ferreira"),
                new String("Bemvindo")
        };

        // TODO: 06/03/2024 tamanho da lista fixa, usa-se 'lenght' 
        // Para descobrir o tamanho de uma lista com conteúdo fixo, eu sempre vou utilizar o 'lenght'
        System.out.println("Tamanho da Lista = " + user.length);
        System.out.println(user[0] + " " + user[2]);

        // Caso 2 criando um Array (tamanho) fixo e com conteúdo fixo
        String[] user2 = new String[3];

        user2[0] = new String("Felipe");
        user2[1] = new String("Ferreira");
        user2[2] = new String("Bemvindo");

        // Para imprimir o conteudo fixo de uma lista, usamos 'list[i]'
        System.out.println(user2[0] + " " + user2[2]);

        // Percorrendo toda a lista de usuários e exibindo o resultado
        // Array (tamanho) dinamico, conteúdo fixo
        User[] users = new User[]{
                new User("Felipe", "123"),
                new User("Matheus", "456"),
                new User("Ferreira", "789"),
                new User("Bemvindo")
        };

        for (User value : users) {
            System.out.println("\nUsuário: " + value.getLogin() + "\nSenha: " + value.getPassword());
        }
    }
}


