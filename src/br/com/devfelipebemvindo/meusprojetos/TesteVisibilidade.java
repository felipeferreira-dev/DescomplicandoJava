package br.com.devfelipebemvindo.meusprojetos;

// Para entender este método abra a classe Visibilidade no package br.com.felipe;
// Viu como aqui não funciona?
// Ps. descomente a linha de codigo 12, para testar e ver que existe um erro, pois não posso chamar o atributo "x"
// da classe Visibilidade, pois ela esta dentro de um outro pacote e a variavel x esta definida como "padrão" (default);

public class TesteVisibilidade {
    static void print(){
//        System.out.println(Visibilidade.x);
    }
}
