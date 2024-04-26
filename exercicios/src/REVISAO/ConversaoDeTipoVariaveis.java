package REVISAO;

public class ConversaoDeTipoVariaveis {
    public static void main(String[] args) {
       // 6.Conversões de Tipo: Declare uma variável do tipo double e atribua a ela o valor de um número inteiro. Imprima o valor.
        //conversão explícita (casting) de um double para um int
        double numero = 42.55;
        int numeroint = (int) numero;

        System.out.println("Valor em int: " + numeroint);

        //conversão implícita (widening) de int para double
        double numeroDouble = 42; // Aqui, 42 é um número inteiro, mas será convertido para double automaticamente

        // Imprima o valor
        System.out.println("Valor em double: " + numeroDouble);
    }
}
