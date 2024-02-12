package academy.devdojo.maratonajava.Javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.Javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nuc10I7", 11000);
        Tomate tomate = new Tomate("Tomate calvo", 20);
        Televisao televisao = new Televisao("Samsung 50\" ",5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
