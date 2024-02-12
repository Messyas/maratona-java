package academy.devdojo.maratonajava.Javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.Javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Tomate tomate = new Tomate("Americano", 23);
        tomate.setDataValidade("11/12/2024");

        CalculadoraImposto.calcularImposto(tomate);




    }
}
