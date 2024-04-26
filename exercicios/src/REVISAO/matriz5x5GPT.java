package REVISAO;

public class matriz5x5GPT {
    public static void main(String[] args) {
        //5.Matrizes (Arrays Bidimensionais): Crie uma matriz (array bidimensional) representando uma tabela de multiplicação de 5x5 e imprima a tabela.

        int[][] tabelaMultiplicacao = new int[5][5];

        // Preencher a matriz com os resultados da multiplicação
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                tabelaMultiplicacao[linha][coluna] = (linha + 1) * (coluna + 1);
            }
        }

        // Imprimir a tabela de multiplicação
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(tabelaMultiplicacao[linha][coluna] + "\t"); // \t para tabulação
            }
            System.out.println(); // Pular para a próxima linha


        }
    }
}
