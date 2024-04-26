package Arrays;

public class maximoMinimo {
    public static void main(String[] args) {
        // Exemplo de uso da função
        int[] array = {5, 2, 9, 1, 7, 3};
        int[] resultado = encontrarMaxMin(array);

        System.out.println("Maior valor: " + resultado[0]);
        System.out.println("Menor valor: " + resultado[1]);
    }

    // Função para encontrar o máximo e mínimo em um array
    public static int[] encontrarMaxMin(int[] array) {
        if (array == null || array.length == 0) {
            // Retorna null se o array for nulo ou vazio
            return null;
        }

        // Inicializa o máximo e o mínimo com o primeiro elemento do array
        int maximo = array[0];
        int minimo = array[0];

        // Percorre o array para encontrar o máximo e o mínimo
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }

        // Retorna um array com o máximo e o mínimo
        int[] resultado = {maximo, minimo};
        return resultado;
    }

}
