package EstruturaDeRepeticao;

import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        /*Tabuada: Escreva um programa que solicite ao usuário um número e gere a tabuada desse número
         exibindo o resultado de todas as multiplicações de 1 a 10.
        Maior número: Escreva um programa que peça ao usuário para inserir três números e determine qual é o maior número entre eles.*/

        Scanner sc = new Scanner(System.in);
        int number;
        int result;

        while (true) {

                System.out.print("--TABUADA--\n");
                System.out.print("| Escolha uma Operação \n|\n");
                System.out.print("| 1 - Adição \n |");
                System.out.print("| 2 - Subtração |\n");
                System.out.print("| 3 - Multiplicação |\n");
                System.out.print("| 4 - Divisão |\n");
                System.out.println("| 5 - sair |");
                System.out.print("Digite uma opção: ");

                int operation = sc.nextInt();


                do {
                    System.out.println("Digite um número: ");
                    number = sc.nextInt();
                } while (number < 0);


                int i;
                if (operation == 1) {
                    System.out.println("Adição");
                    System.out.println("Resultado: ");
                    for (i = 1; i <= 10; i++) {
                        result = number + i;
                        System.out.println(number + " + " + i + " = " + result);
                    }
                } else if (operation == 2) {
                    System.out.println("Subtração");
                    System.out.println("Resultado: ");
                    for (i = 1; i <= 10; i++) {
                        result = number - i;
                        System.out.println(number + " - " + i + " = " + result);
                    }
                } else if (operation == 3) {
                    System.out.println("Multiplicação");
                    System.out.println("Resultado: ");
                    for (i = 1; i <= 10; i++) {
                        result = number * i;
                        System.out.println(number + " * " + i + " = " + result);
                    }
                } else if (operation == 4) {
                    System.out.println("Divisão");
                    System.out.println("Resultado: ");
                    for (i = 1; i <= 10; i++) {
                        result = number / i;
                        System.out.println(number + " / " + i + " = " + result);
                    }

                } else if (operation == 5) {
                    System.out.println("Até Logo!");
                    break;

                }

            }

        }
    }
