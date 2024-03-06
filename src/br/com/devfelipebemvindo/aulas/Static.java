package br.com.devfelipebemvindo.aulas;

import br.com.devfelipebemvindo.meusprojetos.teladelogin.User;

public class Static {

    public static void main(String[] args) {
        User userA = new User("Felipe", 26);
        User userB = new User("João", 18);

        // Método/Variavel estatico -> Permite alterar uma propriedade que pertence diretamente à classe e não ao objeto
        // Fazendo isso todos os objetos irão compartilhar a mesma informação, ou seja (Informação é compartilhada)
        // Neste caso todos objetos terão uma propriedade 'NAME' que será escrita como "Maria"
        User.setNAME("Felipe Bemvindo");
        User.setNAME("Maria");

        // Metodo não estático -> Altera uma propriedade que pertence unicamente a cada objeto
        // ou seja userA possui login "Skanksz" e userB login "User123" (Nesse caso a informação não é compartilhada)
        userA.setLogin("Skanksz");
        userB.setLogin("User123");

        System.out.println(userA.getNAME());
        System.out.println(userB.getNAME());
        System.out.println(userB.getIDADE());

        System.out.println(userA.getLogin());
        System.out.println(userB.getLogin());
        System.out.println(userA.getIDADE());
    }
}
