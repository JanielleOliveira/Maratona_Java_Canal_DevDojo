package CondicionaisIFeELSE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class maiorIdade {
    public static void main(String[] args) {
        /*Escreva um programa que receba a idade de uma pessoa e verifique se ela é maior de idade (18 anos ou mais).
        Se for maior de idade, exiba uma mensagem de boas-vindas;
        caso contrário, exiba uma mensagem informando que a pessoa não pode acessar o conteúdo.*/

        Scanner sc = new Scanner(System.in);
        int age;

        while(true){

            try {
                System.out.println("Digite sua idade: ");
                age = sc.nextInt();
                if (age >= 18){
                    System.out.println("Olá, Seja Bem Vindo");

                }else {
                    System.out.println("Menores de 18 anos não podem acessar o conteúdo! ");
                } break;

            }catch (InputMismatchException e){
                System.out.println("Digite um valor válido para a sua idade!");
                sc.nextLine();
            }
        }




    }
}
