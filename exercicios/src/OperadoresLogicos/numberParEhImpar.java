package OperadoresLogicos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numberParEhImpar {
    public static void main(String[] args) {
        //Exercício que usa operadores lógicos da tabela verdade:
        //6.Escreva um programa que receba um número inteiro e verifique se ele é par e maior do que 10.
        //7.Escreva um programa que receba um número inteiro e verifique se ele é ímpar ou menor do que 20.
        Scanner sc = new Scanner(System.in);
        int number;
        int result;

        while (true) {
            try {
                System.out.print("\nDigite um número: ");
                number = sc.nextInt();
                result = number % 2;

                if (result == 0) {
                    System.out.println("O número " +number+ " é par");
                    boolean isMaiorQueDez = number > 10;
                    System.out.println("Maior que dez?  " + isMaiorQueDez);
                } else if (result != 0) {
                    System.out.println("O número " +number+ " é impar");
                    boolean isMaiorQueVinte = number > 20;
                    System.out.println("Maior que vinte?  " + isMaiorQueVinte);

                } break;

            } catch (InputMismatchException e) {
                System.out.println("Opção Inválida. Digite um número inteiro válido."  +  e.getMessage());
                sc.nextLine(); // limpa o buffer do Scanner para evitar loop infinito
            }

        }
    }
}
