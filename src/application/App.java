package application;

import entities.Usuario;

public class App {
    public static void main(String[] args) {

        Usuario user = new Usuario("José", "ze", "123456");
        boolean retorno = user.login("ze", "123");
        System.out.println("Retorno de login é: " + retorno);

    }
}
