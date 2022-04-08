
package com.company;
import java.util.Scanner;

public class Main {
    //Método auxiliar para imprimir matriz - Para comprobar que está bien
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de filas:");
        int filas = sc.nextInt();

        System.out.println("Numero de columnas:");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Introduce los numeros del array:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        imprimirMatriz(matriz);

    }
}
