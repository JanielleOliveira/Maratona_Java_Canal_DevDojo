package arraysMultidimensionais;

public class matrizMultiplicacao {
    public static void main(String[] args) {
        //05.Matriz de Multiplicação: Crie duas matrizes 2x3 e 3x2 de números inteiros e calcule o produto das duas matrizes.

        // Declaração e inicialização da primeira matriz (2x3)
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Declaração e inicialização da segunda matriz (3x2)
        int[][] matrizB = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Determinação do número de linhas e colunas das matrizes
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int colunasB = matrizB[0].length;

        // Criação da matriz resultado (terá as dimensões corretas)
        int[][] resultado = new int[linhasA][colunasB];

        // Cálculo do produto das matrizes
        for (int i = 0; i < linhasA; i++) { // Loop pelas linhas da matriz resultado
            for (int j = 0; j < colunasB; j++) { // Loop pelas colunas da matriz resultado
                for (int k = 0; k < colunasA; k++) { // Loop para calcular o produto
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Exibição da matriz resultado
        System.out.println("Produto das Matrizes:");
        for (int i = 0; i < linhasA; i++) { // Loop pelas linhas do resultado
            for (int j = 0; j < colunasB; j++) { // Loop pelas colunas do resultado
                System.out.print(resultado[i][j] + " "); // Exibe o valor e espaço
            }
            System.out.println(); // Nova linha para a próxima linha da matriz resultado
        }



    }
}
