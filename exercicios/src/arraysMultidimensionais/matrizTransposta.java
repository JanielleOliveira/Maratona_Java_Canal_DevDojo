package arraysMultidimensionais;

public class matrizTransposta {
    public static void main(String[] args) {
        //03.Matriz Transposta: Crie uma matriz 3x3 de números inteiros e calcule a matriz transposta.

        int[][] matrizOriginal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int linhas = matrizOriginal.length;
        int colunas = matrizOriginal[0].length;

        int[][] matrizTransposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        // Exibindo a matriz transposta
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println(); // Nova linha para a próxima linha da matriz
        }


    }
}
