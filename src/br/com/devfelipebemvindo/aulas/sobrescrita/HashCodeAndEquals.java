package br.com.devfelipebemvindo.aulas.sobrescrita;

import br.com.devfelipebemvindo.meusprojetos.teladelogin.User;

// HashCode é um indentificador único, uma sequencia de caracteres que identifica o objeto
// MUITO ÚTIL PARA COMPARAR DADOS ARMAZENADOS NO BANCO DE DADOS E LISTAS
public class HashCodeAndEquals {

    // Verifique a linha 111 do objeto User
    public static void main(String[] args) {
        // Cada objeto esta apontando para um indexador (espaço na memória), por esse motivo nós sobescrevemos o metodo equals e hashcode
        // Para que seja possivel comparar o conteúdo da lista e não mais comparar o idexador
        User userA = new User("FelipeBemvindo", "123456");
        User userB = new User("Felipe", "123456");

        System.out.println(userA);
        System.out.println(userB);

        System.out.println(userA.hashCode());
        System.out.println(userB.hashCode());
        System.out.println("Os conteúdos do objeto são iguais? " + userA.equals(userB)); // equals utiliza o fundamento de hashCode
    }
}
