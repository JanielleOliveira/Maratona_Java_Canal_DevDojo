package Arrays;

import java.util.Scanner;

public class ArrayMaiorMenor {
    public static void main(String[] args) {
        //3.Escreva um programa que leia um array de números inteiros e exiba o maior e o menor valor.
        Scanner scanner = new Scanner(System.in);
        int tamanho;

        // Lê o tamanho do array
        do {
            System.out.print("Digite o tamanho do array (deve ser maior que zero): ");
            tamanho = scanner.nextInt();
        } while (tamanho <= 0);

        int[] array = new int[tamanho];

        // Lê os elementos do array
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Encontra o maior e o menor valor no array
        int maior = array[0];
        int menor = array[0];
        for (int i = 1; i < tamanho; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        // Exibe o maior e o menor valor
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
