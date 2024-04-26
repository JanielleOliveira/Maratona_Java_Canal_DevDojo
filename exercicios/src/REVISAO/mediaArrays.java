package REVISAO;

public class mediaArrays {
    public static void main(String[] args) {
        //1.Arrays: Crie um array de números inteiros e calcule a média dos valores.

        int[] valores = new int[]{50, 10, 80};
        int soma = 0;

        for (int valor : valores) {
            soma += valor;

        }
        double media = (double) soma / valores.length;

        System.out.println(" A média dos números é : " + media);


    }
}
