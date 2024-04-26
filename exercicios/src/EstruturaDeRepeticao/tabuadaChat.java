package EstruturaDeRepeticao;

import java.util.Scanner;

public class tabuadaChat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, resultado;
        String operacao;

        System.out.println("\n*****TABUADA*****");

        do {
            System.out.print("Digite um número para gerar a tabuada: \n");
            while (!sc.hasNextInt()) {  // Laço de repetição para pedir novamente caso não seja um número válido
                System.out.print("Por favor, digite um número válido: ");
                sc.next();
            }
            num1 = sc.nextInt();

            System.out.print("Digite a operação a ser realizada ( +, -, *, / ): ");
            operacao = sc.next();

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

                System.out.print("Digite a próxima operação ( +, -, *, / ) ou S para voltar ao ínicio: ");
                operacao = sc.next();
            }

            System.out.print("Digite outro número para gerar a tabuada ou S para sair: ");
        } while (sc.hasNextInt());

        System.out.println("Até Logo!");
        sc.close();
    }
}

