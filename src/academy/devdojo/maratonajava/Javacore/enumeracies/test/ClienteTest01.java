package academy.devdojo.maratonajava.Javacore.enumeracies.test;

import academy.devdojo.maratonajava.Javacore.enumeracies.dominio.Cliente;
import academy.devdojo.maratonajava.Javacore.enumeracies.dominio.TipoCliente;

/**
 * enumeracaoes: é usada quando se tem uma escolha dentro de uma quantidade limitada de opcoes, e deve-se forcar o tipo a ser utilizado
 */
public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("messyas gois franca",TipoCliente.PESSOA_FISICA,Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("messyas gois franca",TipoCliente.PESSOA_JURIDICA,Cliente.TipoPagamento.CREDITO);
     //   Cliente cliente3 = new Cliente("messyas gois franca", "pessoa fisic"); forma incorreta

        System.out.println(cliente1);
        System.out.println(cliente2);
     //   System.out.println(cliente3);
    }
}
