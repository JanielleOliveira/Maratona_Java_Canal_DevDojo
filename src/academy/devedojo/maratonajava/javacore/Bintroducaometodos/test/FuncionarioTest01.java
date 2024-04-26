package academy.devedojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devedojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Luffy";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{1200, 2000.50, 5000};

        funcionario.ImprimeDados();

    }
}
