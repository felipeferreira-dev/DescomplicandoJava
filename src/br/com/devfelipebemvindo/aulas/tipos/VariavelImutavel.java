package br.com.devfelipebemvindo.aulas.tipos;

import javax.swing.*;

public class VariavelImutavel {

    // Variavel imutavel (Constante)
    public static final String CHAVE_PIX = "key_pix";

    public static void main(String args[]) {
        //Variáveis Imutáveis = Constantes, não podem sofrer alteração de valor;
        //Começam com "final"
        //São declaradas em letra maiúscula;

        final double PI = 3.14159;

//        PI = 12.0;

        JOptionPane.showMessageDialog(null, CHAVE_PIX);
    }
}
