package REVISAO;

import java.util.Scanner;

public class PositiviNegativo {
    public static void main(String[] args) {
        //4.Condicionais e Estruturas Compostas: Crie um programa que solicite ao usuário que insira um número.
        // Se o número for positivo, imprima "Positivo", se for negativo, imprima "Negativo", e se for zero, imprima "Zero".

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");

        } else {
            System.out.println("Zero");
        }

        // utilizando o operador ternário (para micro validações)
        String resultado = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Zero";
        System.out.println(resultado);

    }
}
