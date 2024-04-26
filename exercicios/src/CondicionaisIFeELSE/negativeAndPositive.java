package CondicionaisIFeELSE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class negativeAndPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Digite um número para saber se é positivo ou negativo: ");

        while(true) try{
            number = sc.nextInt();

            if (number > 0 ){
                System.out.println("Positivo: " +number);

            } else if (number < 0) {
                System.out.println("Negativo: " +number);

            }else {
                System.out.println(" O número zero é um número neutro: " +number);
            } break;

        }catch (InputMismatchException e){
            System.out.print("Opção Inválida!\nDigite um número inteiro: ");
            sc.nextLine();
        }


    }
}
