package academy.devedojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 10;
        long numerogrande = (long) 155.23;
        double salariodouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadebyte = -128;
        short idadeShort = 10;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é "+ idade + " anos");
        System.out.println(falso);
        System.out.println("casting de double para long " +numerogrande);
        System.out.println("Oi meu nome é "+nome);


    }
}
