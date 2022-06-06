package arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayMultiDimensional {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] arrayMatriz = new int[6][5];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                arrayMatriz[i][j] = aleatorio.nextInt(10);
                //arrayMatriz[i][j] = sc.nextInt();
                //System.out.println(arrayMatriz[i][j]);
            }
        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println(arrayMatriz[i][j]);
//            }
//        }
        for (int i = 0; i < 6; i++) {
            String linhaAtual = "";
            for (int j = 0; j < 5; j++) {
                linhaAtual += arrayMatriz[i][j]; // + (j < 0 ? "  " : " | ");
            }
            System.out.println(linhaAtual);
        }

    }
}