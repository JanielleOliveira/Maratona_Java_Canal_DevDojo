package arraysMultidimensionais;

public class localizaElementosMatriz {
    public static void main(String[] args) {
       // 04.Localização de Elementos: Crie uma matriz 4x4 de números inteiros e encontre a linha e coluna em que um valor específico está localizado.

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
            int  elementoProcurado = 2;

        int linha = -1;
        int coluna = -1;

        for ( int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
               if (matriz[i][j] == elementoProcurado){
                   linha = i;
                   coluna = j;
                   break;
               }
            }
        }
        if (linha != -1 && coluna != -1) {
            System.out.println("O valor " + elementoProcurado + " está na linha " + linha + " e coluna " + coluna + ".");
        } else {
            System.out.println("O valor " + elementoProcurado + " não foi encontrado na matriz.");
        }
    }
}
