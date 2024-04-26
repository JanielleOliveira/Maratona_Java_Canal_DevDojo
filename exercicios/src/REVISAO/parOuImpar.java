package REVISAO;

import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        //Estruturas de Controle de Fluxo:
        //Escreva um programa que verifica se um número é par ou ímpar.

        Scanner  sc = new Scanner(System.in);

       int num;
        System.out.println("Digite um número: ");
        num = sc.nextInt();

       if (num % 2 == 0){
           System.out.println("Par");

       }else {
           System.out.println("Ìmpar");
       }



    }
}
