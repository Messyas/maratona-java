package exercicios.ListaDePOO.Exercicio11;

public class Estoque {
    private String nomeProduto;
    private double valor;
    private int quantidade;

    public Estoque(String nomeProduto, double valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void imprimir() {
        System.out.println("Nome do produto " + this.nomeProduto);
        System.out.println("Valor do produto " + this.valor);
        System.out.println("Quantidade do produto " + this.quantidade);
    }

    public int verificarDisponibilidade(int valor) {
       if(quantidade >= valor) {
           System.out.println("Produto disponivel em estoque");
           return 1;
       } else {
           System.out.println("Produto indisponivel");
       }
       return 0;
    }

    public int removerProdutos(int quantidade) {
        int resultado = verificarDisponibilidade(quantidade);
        if(resultado == 1) {
            this.quantidade -= quantidade;
            return 1;
        } else {
            System.out.println("Falha na remocao");
        }
        return 0;
    }
}
