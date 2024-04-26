package academy.devedojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        /*Cada uma dessas formas de inicialização tem seus casos de uso específicos e é escolhida
        com base nos requisitos do programa e na clareza do código.*/

        int[] array = {1, 2, 3}; // inicialização direta

        int[][] arrayInt = new int[3][]; //inicialização de arrays de arrays(matriz)

        arrayInt[0] = new int[2];//Inicialização de Elemento de Matriz como Array Unidimensional
        arrayInt[1] = array;// Inicialização de Elemento de Matriz como Referência para Outro Array
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6}; // Inicialização de Elemento de Matriz como Array Unidimensional

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}}; // Inicialização Direta de Matriz Bidimensional

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-------");
            for (int num : arrayBase) {
                System.out.print(num + " ");

            }
        }

    }
}
