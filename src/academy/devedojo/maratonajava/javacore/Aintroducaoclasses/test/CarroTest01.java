package academy.devedojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devedojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Impala";
        carro1.modelo = "GM-Chevrolet";
        carro1.ano = 1967;

        carro2.nome = "Fusca Bala";
        carro2.modelo = "Sport";
        carro2.ano = 1969;

        carro1 = carro2;

        System.out.println("\nCarro 1");
        System.out.println("Nome: "+ carro1.nome + ", Modelo: " + carro1.modelo + ", Ano: "+ carro1.ano);
        System.out.println("\nCarro 2");
        System.out.println("Nome: "+ carro2.nome + ", Modelo: " + carro2.modelo + ", Ano: "+ carro2.ano);

    }
}
