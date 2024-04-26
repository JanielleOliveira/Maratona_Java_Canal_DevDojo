package Arrays;

public class ArraysPares {
    public static void main(String[] args) {
        //03.Crie um array de números inteiros e retorne apenas os números pares.

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }


    }
}
