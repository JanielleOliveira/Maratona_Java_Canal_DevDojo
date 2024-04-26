package Arrays;

public class MaiorQue100 {
    public static void main(String[] args) {
        //08.Crie um array de números inteiros e verifique se algum deles é maior que 100.
        int[]number = new  int[]{50,60,70,80,90,100,200,300,400,500};

        for (int i : number) { // foreach
            if (i > 100) {
                System.out.println("Maior que 100: " + i);
            } else {
                System.out.println("Menor que 100: " + i);
            }
        }

    }
}
