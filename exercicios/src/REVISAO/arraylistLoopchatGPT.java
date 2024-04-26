package REVISAO;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistLoopchatGPT {
    public static ArrayList<String> listaDeCores = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop para permitir que o usuário adicione várias cores
        while (true) {
            // Exibir a lista de cores atual
            System.out.println("Lista de Cores: " + listaDeCores);

            // Pedir ao usuário para adicionar uma cor ou digitar "sair" para encerrar
            System.out.print("Digite uma cor para adicionar ou 'sair' para encerrar: ");
            String cor = scanner.nextLine();

            // Verificar se o usuário deseja encerrar
            if (cor.equalsIgnoreCase("sair")) {
                break;  // Sair do loop se o usuário digitar "sair"
            }

            // Adicionar a cor à lista
            listaDeCores.add(cor);
            System.out.println("Cor adicionada com sucesso!");
        }

        System.out.println("Programa encerrado. Lista final de cores: " + listaDeCores);
    }
}
