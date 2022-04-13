package mediaAritmetica;

import javax.swing.*;

public class AppMedia {
    private static Calculadora calc1;
    private static Calculadora calc2;

    public static void main(String[] args) {
        //double media1;
        //double media2;
        double soma;

        calc1 = new Calculadora(8, 9, 7);
        calc2 = new Calculadora(4, 5, 6);

        calc1.media();
        calc2.media();
        soma = calc1.soma(calc1.media(), calc2.media());

        System.out.println(calc1.media());
        System.out.println(calc2.media());
        System.out.println(soma);

        JOptionPane.showMessageDialog(null, "Os valores das médias são: " + calc1.media() +" e "
                + calc2.media() +", e a soma é: " + soma);
    }
}
