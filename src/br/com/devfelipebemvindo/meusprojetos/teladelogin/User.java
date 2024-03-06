package br.com.devfelipebemvindo.meusprojetos.teladelogin;

import java.util.Objects;

// Classes são como moldes para se criar um objeto
public class User {

    // Propriedades (Características) do objeto 'Usuario' - (PRIVATE) para garantir que só poderemos alterar o comportamento via setter
    private String login, password = "", loginAcess, passwordAcess;
    // Propriedade estatica -> pertence a classe e não ao objeto
    private static String NAME;
    // final -> Quer dizer que eu não consigo alterar a propriedade, ele vai ser constante ded valor 27 (linha 37)
    // por ser final, eu não consigo alterar o valor nem mesmo via setter ou construtor.
    private static final int IDADE = 27;

    public User() {

    }

    // Criando um construtor para que assim que criar o objeto, eu já conseguir definir as propriedades dele
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login) {
        this.login = login;
    }

    public User(String login, String loginAcess, String password, String passwordAcess) {
        this.login = login;
        this.loginAcess = loginAcess;
        this.password = password;
        this.passwordAcess = passwordAcess;
    }

    public User(String name, int idade) {
        this.NAME = name;
//        IDADE = idade + 1;
    }

    public int getIDADE() {
        return IDADE;
    }

    public String getNAME() {
        return NAME;
    }

    // Metodo estatico, pode alterar a propriedade que pertence a classe e não ao objeto
    public static void setNAME(String nome) {
        NAME = nome;
    }

    //Getters usado para obter o retorno da propriedade que esta armazenada
    public String getLogin() {
        return login;
    }

    public String getLoginAcess() {
        return loginAcess;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordAcess() {
        return passwordAcess;
    }


    // Métodos (comportamentos) qual o tipo de comportamento que o usuáio possui
    //Setters servem também para mudar o comportamento de um estado, só é possível alterar uma propriedade privada, usando setter
    public void setLogin(String login) {
        login = login.trim();
        this.login = login;
    }

    public void setLoginAcess(String loginAcess) {
        //Removedo qualquer espaço em branco que o úsuario possa ter digitado
        loginAcess = loginAcess.trim();
        this.loginAcess = loginAcess;
    }

    public void setPassword(String password) {
        password = password.trim();
        this.password = password;
    }

    public void setPasswordAcess(String passwordAcess) {
        passwordAcess = passwordAcess.trim();
        this.passwordAcess = passwordAcess;
    }

    // Teste de sobrecarga de metodos (apenas a assinatura é diferente)
    public String output() {
        return login.toUpperCase() + " " + password;
    }

    public String output(boolean showPassword) {
        if (showPassword)
            return output();
        else
            return login;
    }

    // @Override significa que estou substituindo um método que já existe em uma superClasse
    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // Equals e hashCode são sobescritos de uma forma onde posso comparar o conteudo do meu objeto (criado com Alt + insert)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    // Só é preciso sobrescrever o hashCode para meus próprios tipos criador, por exemplo o objeto List<User>
    // Se fosse um objeto generico do proprio kit do Java, não precisaria sobrescrever o hash, ex.: List<String>, List<int>
    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }
}

