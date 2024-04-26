package Arrays;

import java.util.Scanner;

public class SomaDoisArrays {
    public static void main(String[] args) {
        /* 4.Escreva um programa que leia dois arrays de números inteiros com a mesma quantidade de elementos
         e exiba a soma dos elementos correspondentes em cada array. */
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos do 1º array: ");
        int tamanho1 = sc.nextInt();
        int[] tam1 = new int[tamanho1];


        for (int i = 0; i < tam1.length; i++) {
            System.out.printf("Informe o %dº número: ", i + 1);
            tam1[i] = sc.nextInt();

        }
        int soma1 = 0;
        for (int x : tam1) {
            soma1 += x;
        }
        System.out.print("Informe a quantidade de elementos do 2º array: ");
        int tamanho2 = sc.nextInt();
        int[] tam2 = new int[tamanho2];

        int soma2 = 0;
        for(int i = 0; i < tam2.length; i++){
            System.out.printf("Informe o %dº número: ", i + 1);
            tam2[i] = sc.nextInt();

        }

        for (int y : tam2) {
            soma2 += y;
        }


        // Exibe o resultado da soma
        System.out.printf("A soma dos elementos do array é: %d\n", soma1 );
        System.out.printf("A soma dos elementos do array é: %d\n", soma2 );


    }
}
