package academy.devedojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotal;

        System.out.println("Valor do carro: R$");
        valorTotal = sc.nextDouble();

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcelas " + parcela + "  R$ " + valorParcela);
        }

    }
}
