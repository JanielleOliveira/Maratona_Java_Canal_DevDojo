package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double receitaBrutaAnual = 25000;

        double aliquota1 = 9.70 / 100;
        double aliquota2 = 37.35 / 100;
        double aliquota3 = 49.50 / 100;
        double valorImposto;

        if(receitaBrutaAnual <= 360000){
            valorImposto = receitaBrutaAnual * aliquota1;
        } else if (receitaBrutaAnual > 34712 && receitaBrutaAnual <= 68507) {
            valorImposto = receitaBrutaAnual * aliquota2;
        } else {
            valorImposto = receitaBrutaAnual * aliquota3;
        }
        System.out.println(valorImposto);


    }
}
