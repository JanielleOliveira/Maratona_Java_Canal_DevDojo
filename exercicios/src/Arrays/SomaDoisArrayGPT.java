package Arrays;

import java.util.Scanner;

public class SomaDoisArrayGPT {
    public static void main(String[] args) {
        /* 4.Escreva um programa que leia dois arrays de números inteiros com a mesma quantidade de elementos
         e exiba a soma dos elementos correspondentes em cada array. */
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos dos arrays: ");
        int tamanho = sc.nextInt();

        int[] array1 = new int[tamanho];
        int[] array2 = new int[tamanho];

        // Preenche o primeiro array
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Informe o %dº número do primeiro array: ", i + 1);
            array1[i] = sc.nextInt();
        }

        // Preenche o segundo array
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Informe o %dº número do segundo array: ", i + 1);
            array2[i] = sc.nextInt();
        }

        // Soma os elementos correspondentes em cada array
        int[] soma = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            soma[i] = array1[i] + array2[i];
        }

        // Exibe o resultado da soma
        System.out.print("A soma dos elementos correspondentes em cada array é: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(soma[i] + " ");
        }
    }
}
