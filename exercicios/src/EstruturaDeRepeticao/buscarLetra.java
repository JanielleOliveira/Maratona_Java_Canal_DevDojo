package EstruturaDeRepeticao;

import java.util.Scanner;

public class buscarLetra {
    /*01.Exercício de busca: Crie um programa que solicita ao usuário que digite uma palavra.
    O programa deve percorrer cada letra da palavra, imprimindo cada letra e sua posição.
    Quando a letra "a" for encontrada, o programa deve imprimir uma mensagem e interromper a execução do loop. */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            System.out.println("Letra " + letra + " na posição " + i);

            if (letra == 'a') {
                System.out.println("Letra a encontrada!");
                break;
            }
        }

        sc.close();
    }

}
