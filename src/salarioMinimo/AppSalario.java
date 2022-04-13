package salarioMinimo;

import java.util.Scanner;

public class AppSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor do salário mínimo? ");
        double salarioMinimo = sc.nextDouble();

        System.out.print("Qual o valor do salário do usuário? ");
        double salarioUsuario = sc.nextDouble();

        double valorEmSminimo = salarioUsuario/salarioMinimo;

        System.out.printf("O valor do salário do usuário em SM é: %.2f%n", valorEmSminimo);

    }
}
