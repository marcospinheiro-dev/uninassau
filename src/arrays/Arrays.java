package arrays;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] arrayTeste1 = {2, 3, 4, 5, 6};
        int[] arrayTeste2 = new int[6];

        for (int i = 0; i < arrayTeste2.length; i++) {
            arrayTeste2[i]=i*2;
        }
        for (int i = 0; i < arrayTeste2.length; i++) {
            System.out.println("arrayTeste2, indice " + i + ": " + arrayTeste2[i] + " ");
        }
        for (int j = 0; j < arrayTeste1.length; j++) {
            System.out.println("arrayTeste1, indice " + j +": " + arrayTeste1[j]+" ");
        }


    }
}
