package exercicios.ListaDePOO.Exercicio07;

public class ContaCorrente {
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    public ContaCorrente() {
    }

    public void imprimir() {
        System.out.println("............................");
        System.out.println(".... IMPRIMINDO - DADOS ....");
        System.out.println("............................\n");

        System.out.println("---------------------------------------");
        System.out.println("Nome do cliente " + this.nomeCliente);
        System.out.println("Conta" + this.conta);
        System.out.println("Agencia" + this.agencia);
        System.out.println("Saldo" + this.saldo);
        System.out.println("---------------------------------------");

    }

    public int sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Valor de saque maior do que o do saldo\n");
            return 0;
        } else {
            this.saldo -= valor;
        }
        return 1;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}

