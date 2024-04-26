package EstruturaDeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 4. Maior número: Escreva um programa que peça ao usuário para inserir três números e determine qual é o maior número entre eles. */
public class biggerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;

        boolean executarPrograma = true;
        while (executarPrograma) {
            try {
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = sc.nextDouble();
                System.out.print("Digite o terceiro número: ");
                num3 = sc.nextDouble();

                if (num1 > num2 && num1 > num3) {
                    System.out.println("O maior número é: " + num1);

                } else if (num2 > num1 && num2 > num3) {
                    System.out.println("O maior número é: " + num2);
                } else {
                    System.out.println("O maior número é: " + num3);
                }

                System.out.println("Deseja executar o programa novamente? (s/n)");
                String resposta = sc.next();

                if (!resposta.equalsIgnoreCase("s")) {
                    executarPrograma = false;
                }
            } catch (InputMismatchException e){
                System.out.println("Digite um valor válido!");
                sc.nextLine();
            }

        }
    }
}

