package OperadoresLogicos;

import java.util.Scanner;

public class multipleThreeOrFive {
    public static void main(String[] args) {
        //8.Escreva um programa que receba um número inteiro e verifique se ele é múltiplo de 3 ou de 5.
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("\nDigite um número:");
            num = sc.nextInt();

            if (num % 3 == 0) {
                System.out.println("Múltiplo de 3: ");
            } else if (num % 5 == 0) {
                System.out.println("Múltiplo de 5:");

            } else {
                System.out.println(" O número não é multiplo de 3 nem de 5!");
            }
        }

    }
}
