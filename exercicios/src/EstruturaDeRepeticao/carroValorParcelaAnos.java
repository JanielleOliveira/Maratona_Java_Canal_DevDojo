package EstruturaDeRepeticao;

import java.util.Scanner;

public class carroValorParcelaAnos {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double valorTotal;
            int anos;

            System.out.println("Valor do carro: R$");
            valorTotal = sc.nextDouble();

            System.out.println("Em quantos anos deseja parcelar?");
            anos = sc.nextInt();

            for (int parcela = 1; parcela <= anos*12; parcela++) {
                double valorParcela = valorTotal / parcela;
                if (valorParcela >= 1000) {
                    System.out.println("o valor da parcela não pode ser menor que R$1000");
                    break;
                }
                System.out.println("Parcelas " + parcela + "  R$ " + valorParcela);
            }

        }
    }
