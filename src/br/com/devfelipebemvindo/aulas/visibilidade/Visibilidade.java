package br.com.devfelipebemvindo.aulas.visibilidade;

public class Visibilidade {

    // visibilidade padrão ou (DEFAULT) = (Essa variavel só pode ser acessada por classes dentro do mesmo pacote do projeto!!!) Ps. precisa ser estatica para ser acessível em outras classes
    // Exemplo da variável x FUNCIONANDO em uma classe do mesmo pacote que esta classe: procure pela classe TesteVisibilidade dentro do package felipe.
    // Exemplo da mesma váriavel NÃO funcionando em uma classe: procure por TesteVisibilidade no package meusprojetos.
    /*default*/ static int x = 0;

    /*public*/ public static int y = 0;

    /*private*/ private static int z = 0;

    public static void main (String args[]){

        // variável local não pode ser estática
        int k = 5;

        //VISIBILIDADE de escopo do projeto
        System.out.println(testeX());
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
    }

    public static String testeX() {
//        x = k; // isso não funciona
        x = 12;
        return String.valueOf(x);
    }
}

// Para acessar variáveis ou constantes em quaisquer classes é necessário acrescentar o 'static'.
// public static int x -> Acessivel em todas as classes e em todos os pacotes do projeto
// static int x -> (Defoult) acessivel em qualquer classe do mesmo pacote
// private static int x -> Acessivel somente dentro da própria classe ou em outras classes utilizando os métodos getter e setter
// variáveis locais -> só podem ter utilidade dentro do escopo da classe. Não podem ser chamadas dentro de métodos.