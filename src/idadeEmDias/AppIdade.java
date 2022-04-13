package idadeEmDias;

import javax.swing.*;

public class AppIdade {

    public static void main(String[] args) {

        Idade total = new Idade(3, 2, 15);
        total.totalEmDias();

        System.out.println("A idade total em dias é : " + total.totalEmDias());

        JOptionPane.showMessageDialog(null, "A idade total em dias é: " + total.totalEmDias());

    }
}
