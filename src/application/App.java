package application;

import entities.Calculadora;
import entities.Usuario;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Usuario user = new Usuario("José", "ze", "123456");
        Calculadora calc = new Calculadora(user);

        System.out.println(calc.soma(5.2, 6.8));
        System.out.println(calc.subtrai(15, 6));
        System.out.println(calc.mult(3.2, 4.1));
        System.out.println(calc.divide(13, 2));
        System.out.println(calc.funcao(7, 4, 2));
        System.out.println(calc.potencia(2,5));
    }
}
