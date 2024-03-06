package br.com.devfelipebemvindo.aulas.tipos.primitivos;

public class TiposPrimitivos {

    public static void main(String[] args){
        // Usado para sair de loop
        boolean isLogged = true;

        // Usado para trabalhar com criptografia e imagens
        byte b = 'a';

        // usado para trabalhar com apenas um caracter
        char a = 'a';

        // short armazena menos espaço
        // int armazena um pouco mais
        // long armazena grande espaço
        short c = 9999;
        int   d = 999999999;
        long  e = 999999999999999999L;

        // float armazena menos espaço (casas decimais)
        // double armazena um pouco mais (casas decimais)
         float f = 199999999999999999999999999999999999999.99f; // 32bit (menor que double)
         double g = 199999999999999999999999999999999999999999999999999999999999999.999999; // 64bit

        // Tipo Não Primitivo
        String character = "string";
    }
}
