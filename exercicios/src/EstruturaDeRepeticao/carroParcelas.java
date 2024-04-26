package EstruturaDeRepeticao;

import java.util.Scanner;

public class carroParcelas {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotal;
        int numParcelas;


        System.out.println("Valor do carro: R$");
        valorTotal = sc.nextDouble();

        System.out.println("Digite o número de parcelas:");
        numParcelas = sc.nextInt();

        for (int parcela = 1; parcela <= numParcelas; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                System.out.println("Parcelamento não permitido para " + parcela + " parcelas. Valor da parcela: R$" + valorParcela);
                break;
            }
            System.out.println("Parcelas " + parcela + "  R$ " + valorParcela);
        }

    }
}
