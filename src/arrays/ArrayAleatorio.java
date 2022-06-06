package arrays;

import java.util.Random;

public class ArrayAleatorio {
    public static void main(String[] args) {
        int[] valor = {2,9,5};
        int[] aleatorio = new int[7];
        Random busca = new Random();

        int[] arrayTeste3 = new int[4];
        Random arrayRandon = new Random();

        for (int i = 0; i < valor.length; i++) {
            aleatorio[i] = valor[busca.nextInt(3)];
            System.out.println("Aleatório " + i + ": " + aleatorio[i]);
        }
        for (int i = 0; i < arrayTeste3.length; i++) {
            arrayTeste3[i] = arrayRandon.nextInt(10);
            System.out.println("arrayTeste3, indice " + i + ": " + arrayTeste3[i]);
        }
    }
}
