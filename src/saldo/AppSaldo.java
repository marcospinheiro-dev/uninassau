package saldo;

import java.util.Scanner;

public class AppSaldo {

    public static void main(String[] args) {

        Saldo saldo = new Saldo(450);

       saldo.saldoAtual();
        System.out.printf("O saldo corrigido é : %.2f%n",  saldo.saldoAtual());
    }
}
