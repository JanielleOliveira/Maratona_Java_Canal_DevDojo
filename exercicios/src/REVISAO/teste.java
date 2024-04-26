package REVISAO;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        // Valor horas de trabalho
        Scanner sc = new Scanner(System.in);

        double salarioMensal;
        int diasTrabalhados;
        int horas;

        System.out.print("Seu sálario mensal:  R$ ");
        salarioMensal = sc.nextDouble();
        System.out.print("Em média trabalha quantos dias ao mês? ");
        diasTrabalhados = sc.nextInt();
        System.out.print("Em média trabalha quantas horas por dia? ");
        horas = sc.nextInt();

        double result = (salarioMensal / diasTrabalhados) / horas;

        System.out.println("Valor hora é: R$ " + result);




    }
}
