package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class dezFinalArray {
    public static void main(String[] args) {
        //10.Crie um array de números inteiros e adicione o número 10 no final do array.

        // Criar um ArrayList de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Adicionar o número 10 ao final do ArrayList
        numeros.add(10);

        System.out.println("ArrayList após adicionar o número 10: " + numeros);


    }

}
