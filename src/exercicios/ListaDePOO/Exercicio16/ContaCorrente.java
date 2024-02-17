package exercicios.ListaDePOO.Exercicio16;

public class ContaCorrente {
    private String nomeCliente;
    private String agencia;
    private String conta;
    private double saldo;

    public ContaCorrente(String nomeCliente, String agencia, String conta) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.conta = conta;
    }
    public ContaCorrente() {

    }

    public int sacar(double valor) {
        if(!(valor >saldo)){
            System.out.println("valor de saque maior do que o do saldo");
            return 0;
        }
        return 1;
    }

    public void depositar(double valor) {
       this.saldo += valor;
        System.out.println("valor depositado ");
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
