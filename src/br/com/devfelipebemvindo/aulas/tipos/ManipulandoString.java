package br.com.devfelipebemvindo.aulas.tipos;

public class ManipulandoString {
    public static void main(String args[]) {

        // length utilizado para contar a quantidade de caracter da String
        String x = "Olá Felipe, seu nome Felipe é Felipe     ";
        System.out.println(x);
        System.out.println("Quantidade de caracteres = " + x.length()); // qtd caracteres
        System.out.println("Texto Concatenado = " + x + " matheus"); // concatenação
        System.out.println("Verificando se esta palavra consta na String = " + x.contains("nome")); // contém caracter
        System.out.println("Informando em qual caracter da frase começa esta palavra = " + x.indexOf("seu")); // Contagem começa em 0 -> Mostra qual o indice da primeira aparição da palavra
        System.out.println("Informando o ultimo caracter = " + x.lastIndexOf("Felipe")); // Mostra o indice da ultima aparição da palavra no texto
        System.out.println("Colocando toda a frase em caixa alta = " + x.toUpperCase()); // Transforme em maiúsculo
        System.out.println("Colocando toda a frase em caixa baixa = " + x.toLowerCase()); // Transforme em minúsculo
        System.out.println("Removendo todo o espaçamento desnecessário = " + x.trim()); // Limpa espaço em branco no início e no fim do texto
        System.out.println("Buncando a frase a partir do 12º caracter = " + x.substring(12)); // Exibe o texto a partir do indice definido
        System.out.println("Cortando a frase = " + x.substring(12, 27)); // Exibe o texto a partir do indice definido
        System.out.println("Comparando as palavras = " + x.equals("Felipe")); // Compara o texto e retorna true ou false

        //Comparando Strings

        // Caso 1 -> Retorna false, pois comparar String usando '==' ele compara na verdade o espaço alocado na memória para aquela variável
        // ex.: y alocado em 0001 e y alocado em 0002
        String y = new String("y");
        String z = new String("z");
        System.out.println("\n" + x == y);

        // Caso 2 -> Pode ser que retorne true, pois pode acontecer de ter 2 variaveis alocado no mesmo espaço de memória
        String txt1 = "123456";
        String txt2 = "123456";
        System.out.println("\n" + txt1 == txt2);

        // Caso 3 -> A forma correta de compaarar String é usando 'equals'
        String senha = "1234";
        String password = "1234";
        System.out.println(senha.equals(password));
    }
}
