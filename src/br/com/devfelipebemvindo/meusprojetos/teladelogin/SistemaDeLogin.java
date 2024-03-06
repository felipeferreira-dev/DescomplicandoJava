package br.com.devfelipebemvindo.meusprojetos.teladelogin;

import javax.swing.*;

public class SistemaDeLogin {

    public static void main(String[] args) {

        boolean isPasswordLenght = false, isLogged = false, isEmpty = false;
        var contaCaracter = 5;

        //Instanciando objeto da classe User
        User user = new User();

        //Pedindo para que o usuário cadastre um nome para login
        JOptionPane.showMessageDialog(null, "Realize seu cadastro no sistema!");


        // Verificando se o campo 'Usuário' esta vazio
        while (!isEmpty) {
            user.setLogin(JOptionPane.showInputDialog("\nDigite um nome de Usuário:"));

            if (user.getLogin().isEmpty())
                JOptionPane.showMessageDialog(null, "\nFavor preencha o campo Usuário");
            else
                isEmpty = true;
        }

        // Verificando se o campo 'Senha' possui o tamanho de 5 caracters
        while (!isPasswordLenght) {

            user.setPassword(JOptionPane.showInputDialog("\nSenha:"));

            if (user.getPassword().length() == contaCaracter) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!");
                isPasswordLenght = true;
            } else {
                JOptionPane.showMessageDialog(null, "Sua senha deve conter 5 caracters!");
                isPasswordLenght = false;
            }
        }

        // Fazer loop enquanto o tamanho da senha for igual à 5 caracteres;
        while (user.getPassword().length() == contaCaracter) {

            //Pedindo para o usuário inserir os seus dados cadastrados, na tela de login;
            JOptionPane.showMessageDialog(null, "*** Tela de Login *** \nInsira seus dados");

            user.setLoginAcess(JOptionPane.showInputDialog("\nUsuário:"));
            user.setPasswordAcess(JOptionPane.showInputDialog("\nSenha:"));

            // Fazer loop enquanto o usuário estiver desconectado;
            while (!isLogged) {

                // Caso o login for efetuado com sucesso o usuario acessa o sistema e sai do loop:
                if (user.getLoginAcess().equals(user.getLogin()) && user.getPasswordAcess().equals(user.getPassword())) {

                    JOptionPane.showMessageDialog(null, "Login Efetuado!");
                    user.setLogin(user.getLogin());
                    user.setPasswordAcess(user.getPassword());
                    contaCaracter++;
                    isLogged = true;
                } else {

                    // Caso houver algum erro na hora de efetuar o login:

                    // Se a QUANTIDADE DE CARACTERES da senha digitada for igual a da senha Cadastrada no sistema &&
                    // Se a SENHA DIGITADA pelo usuario for igual a senha cadastrada no sistema
                    // Mensagem: Usuário incorreto!
                    if (user.getLoginAcess().length() == user.getPassword().length() && user.getPasswordAcess().equals(user.getPassword())) {

                        JOptionPane.showMessageDialog(null, "Nome de usuário incorreto!\nTente novamente");
                        user.setLoginAcess(JOptionPane.showInputDialog("\nUsuário:"));
                        isLogged = false;

                        // Se a QUANTIDADE DE CARACTERES da senha digitada for igual a da senha Cadastrada no sistema &&
                        // Se a SENHA DIGITADA pelo usuario NÃO for igual a senha cadastrada no sistema
                        // Mensagem: Senha invalida!
                    }

                    if (user.getPasswordAcess().length() == user.getPassword().length() && !user.getPasswordAcess().equals(user.getPassword())) {
                        JOptionPane.showMessageDialog(null, "Você digitou uma senha inválida!\nTente novamente:");
                        user.setPasswordAcess(JOptionPane.showInputDialog("\nSenha:"));
                        isLogged = false;
                    }

                    // Se não se a QUANTIDADE DE CARACTERES da senha digitada for DIFERENTE da senha Cadastrada no sistema &&
                    // O login digitado pelo usuario for igual ao login cadastrado no sistema
                    // Mensagem: O usuário digitou uma QUANTIDADE ERRADA DE CARACTERES!
                    else if (user.getPasswordAcess().length() != user.getPassword().length() && user.getLoginAcess().equals(user.getLogin())) {
                        JOptionPane.showMessageDialog(null, "Senha incorreta!\nDica: Sua senha deve conter 5 caracteres");
                        user.setPasswordAcess(JOptionPane.showInputDialog("\nSenha:"));
                        isLogged = false;


                        // Se não se o login e a senha digitados peo úsuario forem DIFERENTES dos dados cadastrados
                        // Mensagem: Usuário ou senha incorretos!
                    } else if (!user.getLoginAcess().equals(user.getLogin()) && !user.getPasswordAcess().equals(user.getPassword())) {
                        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!\nTente novamente:");
                        user.setLoginAcess(JOptionPane.showInputDialog("\nUsuário:"));
                        user.setPasswordAcess(JOptionPane.showInputDialog("\nSenha:"));
                        isLogged = false;
                    }
                }
            }
        }
    }
}
