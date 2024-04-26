package academy.devedojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotal;

        System.out.println("Valor do carro: R$");
        valorTotal = sc.nextDouble();

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcelas " + parcela + " x de R$ " + valorParcela);
        }

    }
}
