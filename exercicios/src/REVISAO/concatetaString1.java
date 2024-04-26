package REVISAO;

public class concatetaString1 {
    public static void main(String[] args) {
        //3.Strings: Concatene duas strings para formar uma mensagem completa.
        String[] concatena = new String[]{"hello", "world!"};

        String result = " ";
        for (int i = 0; i < concatena.length; i++){
            result += concatena[i];
            if (i != concatena.length -1){ //Adiciona espaço se não for o último elemento
                result += " ";
            }
        }
        System.out.println("Mensagem: " + result);


    }
}
