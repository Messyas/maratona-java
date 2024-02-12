package academy.devdojo.maratonajava.Javacore.Npolimorfismo.servico;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.dominio.Tomate;

/**
 * O uso de um objeto generico permite que o metodo de calcular imposto seja extendido por qualquer objeto
 */

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto "+produto.getNome());
        System.out.println("Preco "+produto.getValor());
        System.out.println("Imposto a ser pago "+imposto);

        if(produto instanceof Tomate) { //verifica se o objeto de referencia é uma instancia de tomate
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }
}
