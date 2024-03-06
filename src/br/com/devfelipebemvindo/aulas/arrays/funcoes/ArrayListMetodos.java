package br.com.devfelipebemvindo.aulas.arrays.funcoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMetodos {

    public static void main(String[] args) {
        // String[2] -> Conteudo Fixo
        // new ArrayLista<String>() -> Conteudo Dinâmico

        List<String> names = new ArrayList<>();

        System.out.println("A lista esta vazia? " + names.isEmpty());

        // Adicionando elementos na minha lista de forma dinâmica
        names.add("0 | Nome A");
        names.add("1 | Nome B");
        names.add("  | Nome C");
        names.add("3 | Nome D");
        names.add("  | Nome C");
        names.add("  | Nome C");

        tamanhoListSize(names);

        // Como buscar um elemento específico pelo índice get()
        for (int i = 0; i < names.size(); i++) {
            // Imprimindo cada elemento da lista usando o 'get()'
            System.out.println(names.get(i));
        }

        // TODO: 06/03/2024 indexOf() -> buscar conteúdo pelo nome
        buscaElementoIndex(names);

        qtdElementos(names);

        comparaElementos(names);

        validaSeListaVazia(names);

        buscaElemento(names);

        ordenaListaCrescente(names);

        limpaElementosLista(names);

        // Para matar o objeto inteiro
        names = null;
    }

    private static void tamanhoListSize(List<String> names) {
        // Para descobrir o tamanho da lista dinâmica sempre será 'size()'
        System.out.println("Tamanho da lista dinâmica = " + names.size());
    }

    private static void limpaElementosLista(List<String> names) {
        // Para limpar os dados da lista
        names.clear();
        System.out.println("Agora esta vazia? " + names.isEmpty());
    }

    private static void ordenaListaCrescente(List<String> names) {
        // Ordenando array dinâmico
        // função sort() estatica, então não preciso instanciar esse objeto para acessar a função
        Collections.sort(names);

        // Posso criar um foreach para percorrer minha lista ao em vez de passar por cada índice como um for normal
        for (String name : names) {
            System.out.println(name);
        }
    }

    private static void buscaElemento(List<String> names) {
        // Verifica se a Lista contém algum elemento -> funciona como um filtro de busca ex.: youtube
        System.out.println("A lista contém esse elemento? " + names.contains("0 | Nome A"));
    }

    private static void validaSeListaVazia(List<String> names) {
        // Verifica se a lista esta vazia
        System.out.println("A lista esta vazia? " + names.isEmpty());
    }

    private static void comparaElementos(List<String> names) {
        // Comparando o conteúdo da minha lista
        System.out.println("Validando se os elementos são iguais: " + names.get(2).equals(names.get(5)));
    }

    private static void qtdElementos(List<String> names) {
        // Verifica a quantidade de elementos (conteudo) que minha lista possui
        System.out.println("Quantidade de elementos na lista: " + names.size());
    }

    private static void buscaElementoIndex(List<String> names) {
        // Descobrindo qual o índice do "produto" através do nome do produto
        System.out.println("Index do primeiro conteúdo buscado: " + names.indexOf("  | Nome C"));
        System.out.println("Index do ultimo conteúdo buscado: " + names.lastIndexOf("  | Nome C"));
    }
}
