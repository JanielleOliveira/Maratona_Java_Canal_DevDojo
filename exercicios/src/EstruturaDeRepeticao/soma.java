package EstruturaDeRepeticao;

import java.util.Scanner;

public class soma {
    /*03.Exercício de soma: Crie um programa que solicita ao usuário que digite uma série de números.
     O programa deve calcular a soma desses números ignorando qualquer número negativo.
     Quando o usuário digitar o número zero, o programa deve imprimir a soma total e interromper a execução do loop.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int num = -1; // Inicializado com valor diferente de zero para entrar no loop

        for (int i = 1; num != 0; i++) {
            System.out.printf("Digite o %dº número: ", i);
            num = sc.nextInt();

            if (num > 0) {
                soma += num;
            }
        }

        System.out.println("Soma dos números: " + soma);
    }
}
