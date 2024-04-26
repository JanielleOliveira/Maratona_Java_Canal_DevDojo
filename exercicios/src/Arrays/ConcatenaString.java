package Arrays;

public class ConcatenaString {
    public static void main(String[] args) {
        //02.Crie um array de strings e concatene todos eles em uma única string separada por vírgulas.

        String[]concatena = new String[]{"Maria", "JohnBee", "Saraah", "Hinata", "Naruto"};

        String result = "";
        for (int i = 0; i < concatena.length; i++){
            result += concatena[i];
            if (i != concatena.length -1){ //Adiciona vírgula se não for o último elemento
                result += ", ";
            }

        }
        System.out.print(result);
    }
}
