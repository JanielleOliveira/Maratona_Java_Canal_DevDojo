package arraysMultidimensionais;

public class mediaMatriz {
    public static void main(String[] args) {
        //01.Média de uma Matriz: Crie uma matriz 3x3 de números inteiros e calcule a média dos valores.

        int[][] matriz3x3 = {
                {25, 30, 40},
                {55, 60, 70},
                {85, 90, 30}};

        int soma = 0;
        // Iterar pelas colunas da matriz
        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                soma += matriz3x3[i][j];
            }
        }
        double media = (double) soma / (matriz3x3.length * matriz3x3[0].length);
        System.out.println("Média: " + media);

      /*  //Iterar pelas linhas da matriz: foreach
        for (int[] i : matriz3x3)
         // Iterar pelas colunas da matriz
            for (int j : i) {
                soma += j / 9;
            } */


    }

}
