package REVISAO;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistCores {
    public static void main(String[] args) {
        //2.	Listas (ArrayList): Utilize um ArrayList para armazenar nomes de cores. Permita que o usuário adicione novas cores à lista.
        ArrayList<String> listaCores = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        listaCores.add("Azul");
        listaCores.add("Verde");
        listaCores.add("Vermelho");

        System.out.println("Lista de Cores: " + listaCores);

        System.out.println("Digite uma cor para adicionar a lista: ");
        String cor = sc.nextLine();

        listaCores.add(cor);

        System.out.println("Lista de Cores: " + listaCores);


    }
}
