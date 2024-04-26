package OperadoresLogicos;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        /*Escreva um programa que receba dois valores booleanos e verifique se ambos são verdadeiros.
        1.Escreva um programa que receba dois valores booleanos e verifique se pelo menos um deles é verdadeiro.
        2.Escreva um programa que receba dois valores booleanos e verifique se ambos são falsos.
        3.Escreva um programa que receba dois valores booleanos e verifique se nenhum deles é verdadeiro.
        4.Escreva um programa que receba três valores booleanos e verifique se pelo menos dois deles são verdadeiros.
        5.Escreva um programa que receba três valores booleanos e verifique se pelo menos dois deles são verdadeiros.*/

        Scanner sc = new Scanner(System.in);
        // && "E"
        // Recebe dois valores booleanos do usuário
        System.out.println("Digite o primeiro valor booleano (true/false):");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Digite o segundo valor booleano (true/false):");
        boolean valor2 = sc.nextBoolean();


        // Verifica se ambos são verdadeiros usando o operador "AND" &&
        // se pelo menos um deles é verdadeiro. "OR" ||
        //se ambos são falsos. "NOT" " ! " e " || "
        //Nenhum Verdadeiro " ! " e " && "

        boolean ambosSaoVerdadeiros = valor1 && valor2;
        boolean aoMenosUmEVerdadeiro = valor1 || valor2;
        boolean ambosFalsos = !valor1 || !valor2;
        boolean nenhumVerdadeiro = !valor1 && !valor2;


        // Imprime o resultado
        System.out.println("Ambos valores são verdadeiros? " + ambosSaoVerdadeiros);
        System.out.println("Pelo menos um deles é verdadeiro? " + aoMenosUmEVerdadeiro);
        System.out.println("Ambos são falsos? " + ambosFalsos);
        System.out.println("Nenhum deles é verdadeiro? " + nenhumVerdadeiro);


        System.out.println("\nDigite o terceiro valor booleano (true/false):");
        boolean valor3 = sc.nextBoolean();
        boolean aoMenosDoisVerdadeiros = valor1 && valor2 || valor1 && valor3 || valor2 && valor3;
        System.out.println("Pelo menos dois deles são verdadeiros? " + aoMenosDoisVerdadeiros);





    }
}
