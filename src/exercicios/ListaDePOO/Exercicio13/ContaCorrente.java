package exercicios.ListaDePOO.Exercicio13;

public class ContaCorrente {
    private String nomeCliente;
    private String conta;
    private String agencia;
    private Double saldo;

    public ContaCorrente(String nomeCliente, String conta, String agencia) {
        this.nomeCliente = nomeCliente;
        this.conta = conta;
        this.agencia = agencia;
    }

    public double sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Valor de saque maior que o do saldo ");
            return 0;
        }
        System.out.println("Saque efetivado");
        return 1;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Valor depositado ");
    }

    public void imprimir() {
        System.out.println("|-------- SEJA BEM VINDO ----------|");
        System.out.println("| -- Cliente " + this.nomeCliente + " -- |");
        System.out.println("| Sua agencia é " + this.agencia + " e sua conta é" + this.conta);
        System.out.println("|--------------------------------------|\n");
        System.out.println(" O Saldo disponivel nessa conta: " + this.saldo + " |");
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
