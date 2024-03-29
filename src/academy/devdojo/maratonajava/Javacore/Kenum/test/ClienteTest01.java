package academy.devdojo.maratonajava.Javacore.Kenum.test;

import academy.devdojo.maratonajava.Javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.Javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.Javacore.Kenum.dominio.TipoPagamento;

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
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(200));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(200));

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa fisica");
        System.out.println(tipoCliente2);

    }
}
