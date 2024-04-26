package academy.devedojo.maratonajava.introducao;

/*Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

* Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario> , na data <data>
* */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Itachi Uchiha";
        String endereco = "Avenida Brasil";
        String dataRecebimento = "18/01/2023";
        double salario = 20500.00;
        String relatorio = "Eu " +nome+ ", morando no endereço "+endereco+ ", confirmo que recebi o salário de R$" +salario+ ", na data "   +dataRecebimento;

        System.out.println(relatorio);

    }
}
