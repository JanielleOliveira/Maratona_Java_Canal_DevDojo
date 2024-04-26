package OperadoresLogicos;

import java.util.Scanner;

public class XorExclusive {
    public static void main(String[] args) {
       // 10.Escreva um programa que receba dois valores booleanos e verifique se exatamente um deles é verdadeiro.

        Scanner sc = new Scanner(System.in);

      boolean a;
      boolean b;


        System.out.println("Digite oum valor booleano: ");
        a = sc.nextBoolean();
        System.out.println("Digite o segundo valor booleano: ");
        b = sc.nextBoolean();

        if ((a ^ b)){
            System.out.println("Exatamente um deles é verdadeiro: ");

        }else {
            System.out.println("Nenhum ou mais de um valor é verdadeiro: ");
        }


    }
}
