package Arrays;

import java.util.Scanner;

public class SomaDoisArrayGPT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho;

        // Lê o tamanho dos arrays
        do {
            System.out.print("Digite o tamanho dos arrays (deve ser maior que zero): ");
            tamanho = scanner.nextInt();
        } while (tamanho <= 0);

        int[] array1 = new int[tamanho];
        int[] array2 = new int[tamanho];

        // Lê os elementos do primeiro array
        System.out.println("Digite os elementos do primeiro array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Lê os elementos do segundo array
        System.out.println("Digite os elementos do segundo array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Exibe a soma dos elementos correspondentes em cada array
        System.out.println("Soma dos elementos correspondentes:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + (array1[i] + array2[i]));
        }
    }
}
