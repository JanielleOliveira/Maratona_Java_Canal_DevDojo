package Arrays;

import java.util.Scanner;

public class SomaArrayGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de elementos do array
        System.out.print("Informe a quantidade de elementos do array: ");
        int tamanho = scanner.nextInt();

        // Cria o array com o tamanho informado pelo usuário
        int[] numeros = new int[tamanho];

        // Solicita ao usuário que insira os números do array
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %dº número: ", i+1);
            numeros[i] = scanner.nextInt();
        }

        // Calcula a soma dos elementos do array
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        // Exibe o resultado da soma
        System.out.printf("A soma dos elementos do array é: %d\n", soma);

        scanner.close();
    }
}
