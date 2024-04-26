package academy.devedojo.maratonajava.introducao;

public class Aula7Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[5]; //Inicialização por iteração
        int[] numeros2 = {1, 2, 3, 4, 5};//Inicialização direta
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};//Inicialização por construtor

       /* for (int i = 0; i < numeros3.length; i++) {
           System.out.println(numeros3[i]);
        }*/

        for (int num: numeros3) { // foreach
            System.out.println(num);

        }
    }
}
