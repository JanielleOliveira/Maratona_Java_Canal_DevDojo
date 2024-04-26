package EstruturaDeRepeticao;

import java.util.Scanner;

public class Tabuada02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, resultado;
        String operacao;


        System.out.println("\n*****TABUADA*****");

        System.out.print("Digite um número para gerar a tabuada: ");
        num1 = sc.nextInt();

        System.out.print("Digite a operação a ser realizada ( +, -, *, / ): ");
        operacao = sc.nextLine();
        sc.nextLine(); // consumir o \n pendente deixado pelo nextInt()

        while (!operacao.equals("s")) {

            switch (operacao) {
                case "+":
                    System.out.println("\nAdição: ");
                    for (int i = 1; i <= 10; i++) {
                        resultado = num1 + i;
                        System.out.println(num1 + " + " + i + " = " + resultado);
                    }
                    break;
                case "-":
                    System.out.println("\nSubtração: ");
                    for (int i = 1; i <= 10; i++) {
                        resultado = num1 - i;
                        System.out.println(num1 + " - " + i + " = " + resultado);
                    }
                    break;
                case "*":
                    System.out.println("\nMultiplicação: ");
                    for (int i = 1; i <= 10; i++) {
                        resultado = num1 * i;
                        System.out.println(num1 + " * " + i + " = " + resultado);
                    }
                    break;
                case "/":
                    System.out.println("\nDivisão: ");
                    if (num1 == 0) {
                        System.out.println("Não é possível dividir por zero!");
                    } else {
                        for (int i = 1; i <= 10; i++) {
                            resultado = num1 / i;
                            System.out.println(num1 + " / " + i + " = " + resultado);
                        }
                    }
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;

            }

            System.out.println("Digite a proxima operação ( +, -, *, / ) ou S para sair :");
            operacao = sc.nextLine();

        }
        System.out.println("Até Logo!");
        sc.close(); // fechar o scanner para evitar vazamentos de recursos

    }
}
