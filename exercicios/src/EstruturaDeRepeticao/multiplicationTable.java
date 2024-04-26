package EstruturaDeRepeticao;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        /* 02. Calculadora: Escreva um programa que funcione como uma calculadora básica.
         Peça ao usuário para inserir dois números e uma operação (adição, subtração, multiplicação ou divisão).
         Em seguida, execute a operação e exiba o resultado. */
        Scanner sc = new Scanner(System.in);
        int number;
        int result;
        int i;

        do {
            System.out.println("Digite um número: ");
            number = sc.nextInt();
        } while (number < 0);

        System.out.println("Resultado: ");
        for (i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }


    }
}
        /*
        Correção/ outra forma mais simples

        import java.util.Scanner;

        public class Tabuada {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num;

                System.out.print("Digite um número para gerar a tabuada: ");
                num = sc.nextInt();

                for (int i = 1; i <= 10; i++) {
                    int resultado = num * i;
                    System.out.println(num + " x " + i + " = " + resultado);
                }
            }
        } */
