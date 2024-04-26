package CondicionaisIFeELSE;

import java.util.Scanner;

public class mediaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Sua nota: ");
        nota = sc.nextDouble();

        if (nota < 5){
            System.out.println("Reprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        } else if (nota >=7 && nota <=10) {
            System.out.println("Aprovado!");

        }else {
            System.out.println("Nota Inválida!");
        }
    }
}
