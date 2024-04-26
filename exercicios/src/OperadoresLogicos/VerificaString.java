package OperadoresLogicos;

import java.util.Scanner;
/* 9.Escreva um programa que receba uma string
  e verifique se ela começa com a letra "A" e tem pelo menos 5 caracteres.*/

public class VerificaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String s = sc.nextLine();

        if (s.startsWith("A") && s.length() >= 5) {
            System.out.println("A string começa com a letra 'A' e tem pelo menos 5 caracteres.");
        } else {
            System.out.println("A string não atende aos critérios especificados.");
        }
    }

}
