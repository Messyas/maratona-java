package academy.devdojo.maratonajava.Javacore.Kenum.dominio;

public class Cliente {
    public enum TipoPagamento {//classe enum dentro de outra classe
        DEBITO, CREDITO
    }

    private String nome;
    private TipoCliente tipoCliente; //essa associacao entre a classe enum e a classe desejada permite que as enumeracoes sejam acessadas
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}

