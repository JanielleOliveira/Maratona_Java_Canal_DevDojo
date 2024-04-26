package EstruturaDeRepeticao;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        int result;

        while(true){

            System.out.print("--Escolha uma Operação--\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Adição \n");
            System.out.print("| Opção 2 - Subtração |\n");
            System.out.print("| Opção 3 - Multiplicação |\n");
            System.out.print("| Opção 4 - Divisão |\n");
            System.out.print("| Opção 5 - Sair |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Adição");
                    System.out.println("insira um número inteiro: ");
                    number1 = sc.nextInt();
                    System.out.println("insira um número inteiro: ");
                    number2 = sc.nextInt();
                    result = number1 + number2;
                    System.out.println("Resultado: " + result);
                    break;

                case 2:
                    System.out.println("Subtração");
                    System.out.println("insira um número inteiro: ");
                    number1 = sc.nextInt();
                    System.out.println("insira um número inteiro: ");
                    number2 = sc.nextInt();
                    result = number1 - number2;
                    System.out.println("Resultado: " + result);
                    break;
                case 3:
                    System.out.println("Multiplicação");
                    System.out.println("insira um número inteiro: ");
                    number1 = sc.nextInt();
                    System.out.println("insira um número inteiro: ");
                    number2 = sc.nextInt();
                    result = number1 * number2;
                    System.out.println("Resultado: " + result);
                    break;
                case 4:
                    System.out.println("Divisão");
                    System.out.println("insira um número inteiro: ");
                    number1 = sc.nextInt();
                    System.out.println("insira um número inteiro: ");
                    number2 = sc.nextInt();
                    result = number1 / number2;
                    System.out.println("Resultado: " + result);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;


            }

        }
    }
}

        /* FORMA MAIS SIMPLES(correção)

        import java.util.Scanner;

        public class Calculadora {
          public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double num1, num2, resultado;
            String operacao;

            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = sc.nextDouble();

            System.out.print("Digite a operação a ser realizada (+, -, *, /): ");
            operacao = sc.next();

            switch (operacao) {
              case "+":
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
              case "-":
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
              case "*":
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
              case "/":
                if (num2 == 0) {
                  System.out.println("Não é possível dividir por zero!");
                } else {
                  resultado = num1 / num2;
                  System.out.println(num1 + " / " + num2 + " = " + resultado);
                }
                break;
              default:
                System.out.println("Operação inválida!");
                break;
            }
          }
        }*/