package br.com.devfelipebemvindo.aulas.tipos.nao_primitivos;

import static br.com.devfelipebemvindo.aulas.tipos.VariavelImutavel.CHAVE_PIX;

public class TiposNaoPrimitivos {
    public static void main(String args[]) {
        // tipo primitivo(int, double, float...) dê preferencia a eles, caso for armazenar algo simples!
        int x = 2;
        // tipo NÃO primitivo (Integer, Double, String...) dê preferencia, caso precise converter numeros. ex de: int para String ou para double!
        Double y = 4.0;

        System.out.println(y.intValue());
        System.out.println(CHAVE_PIX);
    }
}
