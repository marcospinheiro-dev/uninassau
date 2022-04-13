/*
Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
 */

package antecessorSucessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int num = sc.nextInt();

        System.out.println("O número digitado foi: " + num);
        System.out.println("Seu antecessor é: " + (num-1));
        System.out.println("Seu sucessor é: " + (num+1));
    }
}
