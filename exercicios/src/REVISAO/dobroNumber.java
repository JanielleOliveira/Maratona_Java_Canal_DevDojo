package REVISAO;

import java.util.Scanner;

public class dobroNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Digite um número: ");
        number = sc.nextInt();

        number = number + number;

        System.out.println(" O dobro do número é: " + number);

    }
}
