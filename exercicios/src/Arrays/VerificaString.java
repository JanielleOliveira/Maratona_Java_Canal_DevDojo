package Arrays;

import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {
        //04.Crie um array de strings e retorne apenas as strings que têm mais de 5 caracteres
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de Strings do array: ");
       int tamanho = sc.nextInt();
        String[]check= new String[tamanho];

        System.out.println("Digite as palavras do array: ");
        for (int i = 0; i < tamanho; i++){
            check[i] = sc.next();
        }
        System.out.println("Strings que têm mais de 5 caracteres: ");
        for (int i =0; i < tamanho; i++){
            if (check[i].length() > 5){
                System.out.print(check[i]+",");
            }
        }
        sc.close();
    }
}
