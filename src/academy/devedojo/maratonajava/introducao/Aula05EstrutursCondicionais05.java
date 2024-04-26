package academy.devedojo.maratonajava.introducao;

public class Aula05EstrutursCondicionais05 {
    public static void main(String[] args) {
        // char, int, byte, short, enum, long, String e entre outros
        byte dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Terç");
                break;
            case 4:
                System.out.println("Quar");
                break;
            case 5:
                System.out.println("Quin");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("opção Inválida");
                break;
        }

        char sexo = 'F';
        switch (sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Inválido");
                break;
        }


    }
}
