package br.com.devfelipebemvindo.meusprojetos;

import javax.swing.*;

// ©FelipeFerreira - software de login no sistema
public class LoginTeste {

    public static void main(String[] args) {

        //Declarando Variáveis
        String login, password = "", loginAcess, passwordAcess;
        var contaCaracter = 5;
        boolean isLogged = false, isPasswordLenght = false;

        //Pedindo para que o usuário cadastre um nome para login
        JOptionPane.showMessageDialog(null, "Realize seu cadastro no sistema!");
        login = JOptionPane.showInputDialog("\nDigite um nome de Usuário:");

        while (login.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo nome deve ser preenchido!");
            login = JOptionPane.showInputDialog("\nDigite um nome de Usuário:");
        }

        //Removedo qualquer espaço em branco que o úsuario possa ter digitado
        login = login.trim();

        // Fazer loop enquanto o tamanho da senha for diferente de 5;
        while (!isPasswordLenght) {

            // Pedindo para o usuário cadastrar uma senha;
            password = JOptionPane.showInputDialog("\nSenha:");

            // Aceitando somente senhas com o tamanho de 5 caracteres;
            // Quando o usuário digitar uma senha com tamanho 5, o loop acaba;
            if (password.length() == contaCaracter) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!");
                isPasswordLenght = true;
            } else {
                JOptionPane.showMessageDialog(null, "Sua senha deve conter 5 caracters!");
                isPasswordLenght = false;
            }
        }


        // Fazer loop enquanto o tamanho da senha for igual à 5 caracteres;
        while (password.length() == contaCaracter) {


            //Pedindo para o usuário inserir os seus dados cadastrados, na tela de login;
            JOptionPane.showMessageDialog(null, "*** Tela de Login *** \nInsira seus dados");
            loginAcess = JOptionPane.showInputDialog("\nUsuário:");
            //Removedo qualquer espaço em branco que o úsuario possa ter digitado
            loginAcess = loginAcess.trim();

            passwordAcess = JOptionPane.showInputDialog("\nSenha:");

            // Fazer loop enquanto o usuário estiver desconectado;
            while (!isLogged) {

                // Caso o login for efetuado com sucesso o usuario acessa o sistema e sai do loop:
                if (loginAcess.equals(login) && passwordAcess.equals(password)) {

                    JOptionPane.showMessageDialog(null, "Login Efetuado!");
                    loginAcess = login;
                    passwordAcess = password;
                    contaCaracter++;
                    isLogged = true;

                } else {

                    // Caso houver algum erro na hora de efetuar o login:

                    // Se a QUANTIDADE DE CARACTERES da senha digitada for igual a da senha Cadastrada no sistema &&
                    // Se a SENHA DIGITADA pelo usuario for igual a senha cadastrada no sistema
                    // Mensagem: Usuário incorreto!
                    if (passwordAcess.length() == password.length() && passwordAcess.equals(password)) {

                        JOptionPane.showMessageDialog(null, "Nome de usuário incorreto!\nTente novamente");
                        loginAcess = JOptionPane.showInputDialog("\nUsuário:");
                        isLogged = false;


                        // Se a QUANTIDADE DE CARACTERES da senha digitada for igual a da senha Cadastrada no sistema &&
                        // Se a SENHA DIGITADA pelo usuario NÃO for igual a senha cadastrada no sistema
                        // Mensagem: Senha invalida!
                    }
                    if (passwordAcess.length() == password.length() && !passwordAcess.equals(password)) {
                        JOptionPane.showMessageDialog(null, "Você digitou uma senha inválida!\nTente novamente:");
                        passwordAcess = JOptionPane.showInputDialog("\nSenha:");
                        isLogged = false;
                    }


                    // Se não se a QUANTIDADE DE CARACTERES da senha digitada for DIFERENTE da senha Cadastrada no sistema &&
                    // O login digitado pelo usuario for igual ao login cadastrado no sistema
                    // Mensagem: O usuário digitou uma QUANTIDADE ERRADA DE CARACTERES!
                    else if (passwordAcess.length() != password.length() && loginAcess.equals(login)) {
                        JOptionPane.showMessageDialog(null, "Senha incorreta!\nDica: Sua senha deve conter 5 caracteres");
                        passwordAcess = JOptionPane.showInputDialog("\nSenha:");
                        isLogged = false;


                        // Se não se o login e a senha digitados peo úsuario forem DIFERENTES dos dados cadastrados
                        // Mensagem: Usuário ou senha incorretos!
                    } else if (!loginAcess.equals(login) && !passwordAcess.equals(password)) {
                        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!\nTente novamente:");
                        loginAcess = JOptionPane.showInputDialog("\nUsuário:");
                        passwordAcess = JOptionPane.showInputDialog("\nSenha:");
                        isLogged = false;
                    }
                }
            }
        }
    }
}

//Legenda:
// isPasswordLenght
// isPasswordLenght = true ... Compara o tamanho da senha e sai do loop
// isPasswordLenght = false ... Compara o tamanho da senha e continua do loop

// isLogged
// isPasswordLenght = true ... Usuario conectado ao sistema, efetua o login
// isPasswordLenght = false ... Usuario desconectado do sistema, continua em loop

// login = login.trim();
// Remove todos os espaços em branco antes de começar a frase e depois que a frase termina!


