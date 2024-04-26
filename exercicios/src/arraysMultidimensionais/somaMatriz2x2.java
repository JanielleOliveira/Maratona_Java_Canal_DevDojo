package arraysMultidimensionais;

public class somaMatriz2x2 {
    public static void main(String[] args) {
        // 02.Soma de Matrizes: Crie duas matrizes 2x2 de números inteiros e calcule a soma das duas matrizes.
        int[][] matriz = new int[2][2];
        matriz[0][0]= 10;
        matriz[0][1]= 10;

        matriz[1][0]= 10;
        matriz[1][1]= 10;

        int[][] matriz2 = new int[2][2];
        matriz2[0][0]= 10;
        matriz2[0][1]= 10;

        matriz2[1][0]= 10;
        matriz2[1][1]= 10;


        int soma1 = 0;
        int soma2 = 0;

       for (int i = 0; i < matriz.length; i++){
           for (int j = 0; j < matriz[i].length; j++){
               soma1 += matriz2[i][j];

           }
       }
        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                soma2 += matriz2[i][j];

            }
        }

     int result = soma1 + soma2 ;
        System.out.println("Soma das duas matrizes: " +result);

    }
}
