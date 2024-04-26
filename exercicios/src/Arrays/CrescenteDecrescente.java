package Arrays;

public class CrescenteDecrescente {
    public static void main(String[] args) {
        //07.Crie um array de números inteiros e ordene-os em ordem crescente e decrescente.
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Ordenação crescente
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        //Imprime o array ordenado em ordem crescente
        System.out.println("Array ordenado em ordem crescente:");
        for (int i : num) { //foreach
            System.out.print(i + " ");
        }
        System.out.println();

        //Ordenação decrescente
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        //Imprime o array ordenado em ordem decrescente
        System.out.println("Array ordenado em ordem decrescente:");
        for (int i : num) { //foreach
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
