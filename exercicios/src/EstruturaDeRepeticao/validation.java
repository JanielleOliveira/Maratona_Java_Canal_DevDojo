package EstruturaDeRepeticao;

import java.util.Scanner;

public class validation {
    /* 02.Exercício de validação: Crie um programa que solicita ao usuário que digite uma senha.
     O programa deve percorrer cada letra da senha, verificando se ela é uma letra maiúscula.
     Se uma letra maiúscula for encontrada, o programa deve imprimir uma mensagem de erro e interromper a execução do loop.
     Se a senha for válida, o programa deve imprimir uma mensagem de confirmação. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha = sc.nextLine();

        boolean contemMaiuscula = false;

        for (int i = 0; i < senha.length(); i++) {
            char letra = senha.charAt(i);
            if (Character.isUpperCase(letra)) { // método da classe character
                contemMaiuscula = true;
                break;
            }
        }

        if (contemMaiuscula) {
            System.out.println("Erro: a senha não pode conter letras maiúsculas.");
        } else {
            System.out.println("Senha válida.");
        }
    }
}
