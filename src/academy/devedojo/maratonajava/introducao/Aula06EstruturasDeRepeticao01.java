package academy.devedojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while e for
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("1º Número(while): ");
        count = sc.nextInt();

        while (count <= 10) {
            System.out.println(count);
            count++; // count = count + 1;

        }

        System.out.println("2º Número(do-while):");
        count = sc.nextInt();
        do {
            System.out.println("Dentro do do-while: " + ++count);
        } while (count < 10);

        for (int i=0; i <= 10; i++) {
            System.out.println("For: " +i);

        }


    }
}
