package EstruturaDeRepeticao;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*01. Adivinhe o número: Escreva um programa que gere um número aleatório e peça ao usuário para adivinhar o número.
        Se o número inserido pelo usuário for maior ou menor do que o número gerado aleatoriamente
        informe-o e permita que ele tente novamente. Continue fazendo isso até que o usuário acerte o número.*/

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(5) + 1; // gerar número aleatório de 1 a 100
        int guess;
        while (true) try {
            System.out.println("Adivinhe o número (1-100):");
            do {
                guess = sc.nextInt();
                if (guess < number) {
                    System.out.println("O número é maior.");
                } else if (guess > number) {
                    System.out.println("O número é menor.");
                }
            } while (guess != number);
            System.out.println("Parabéns, você acertou o número!");
            break;
        }
        catch (InputMismatchException e) {
            System.out.println("Digite um número inteiro entre 1 e 100! \n");
            sc.nextLine();
        }
    }
}
