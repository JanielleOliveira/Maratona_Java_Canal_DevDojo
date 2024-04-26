package academy.devedojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // <> <= >= == !=

        boolean isDezMaiorQue = 10 > 20;
        boolean isDezMenorQue = 10 < 20;
        boolean isDezMaiorOuIgual = 10 >= 20;
        boolean isDezMenorOuIgual = 10 <= 20;
        boolean isDezIgualA = 10 == 20;
        boolean isDezDiferenteDe = 10 != 10.0;
        System.out.println("isDezMaiorQue20 " +isDezMaiorQue);
        System.out.println("isDezMenorQue20 " +isDezMenorQue);
        System.out.println("isDezMaiorOuIgual20 " +isDezMaiorOuIgual);
        System.out.println("isDezMenorOuIgual20 " +isDezMenorOuIgual);
        System.out.println("isDezIgualA20 " +isDezIgualA);
        System.out.println("isDezDiferenteDe20 " +isDezDiferenteDe);
        System.out.println("\n");

        // && AND, || OR, ! NO

        // &&
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 4612;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("\n");

        // ||

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

       boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorTotalContaPoupanca || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
        System.out.println("\n");

        // = , +=, -=, *=, /=,  %=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 800
        bonus *= 2; // 1800 * 2
        bonus /= 2; // 1800 / 2
        bonus %= 2; // 1800 % 2
        System.out.println("bonus " +bonus);
        System.out.println("\n");

        //
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador ++;
        contador --;
        ++ contador;
        -- contador;
        int contador2 =0;
        System.out.println("contador1 " +contador);
        System.out.println(++contador2); // primeiro incrementa depois executa
        System.out.println(contador2++); // executa depois incrementa


    }
}
