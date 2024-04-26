package CondicionaisIFeELSE;

import java.util.Scanner;

public class biggerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int num1, num2;

        System.out.println(" Digite um núemro: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo núemro: ");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro número é o maior: " +num1);
        } else if (num2 > num1) {
            System.out.println("O segundo número é o maior: " +num2);
        } else if (num1 == num2) {
            System.out.println("Os números são iguais: " +num1+ " e " +num2);

        }


    }
}
