package Arrays;

public class SomaArray {
    public static void main(String[] args) {
        // 1.Escreva um programa que leia um array de números inteiros e exiba a soma dos elementos.

        int[] num = { 10, 20, 30, 40, 50 };
        int soma = 0;

        for (int i = 0; i < num.length; i++) {
            soma += num[i];

        }
        System.out.println(soma);
    }
}
