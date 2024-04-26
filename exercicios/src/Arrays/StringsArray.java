package Arrays;

import java.util.Scanner;

public class StringsArray {
    public static void main(String[] args) {
        // 2.Escreva um programa que leia um array de strings e exiba somente as strings que começam com a letra "A".
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de palavras do array: ");
        int tamanhoArray = sc.nextInt();
        String[] palavras = new String[tamanhoArray];

        System.out.println("Digite as palavras do array: ");
        for (int i = 0; i < tamanhoArray; i++){
            palavras[i] = sc.next();
        }

        System.out.println("Elementos que começam com a letra A: ");
        for (int i =0; i < tamanhoArray; i++){
            if (palavras[i].startsWith("A")){
                System.out.println(palavras[i]);
            }
        }
    }
}
