package exercicios.TesteDeSoftware.contacorrente;

public class ContaCorrente {

    private String correntista, noConta;
    private float saldo;

    public ContaCorrente(String correntista, String noConta, float saldo) {
        this.correntista = correntista;
        this.noConta = noConta;
        this.saldo = saldo;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public void setNoConta(String noConta) {
        this.noConta = noConta;
    }

    public String getCorrentista() {
        return correntista;
    }

    public String getNoConta() {
        return noConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean deposita(float valor) {
        boolean depositou=false;
        if (valor>=0) {
            saldo += valor;
            depositou=true;
        }
        return depositou;
    }

    public boolean saque(float valor) throws SaldoInsuficienteException {
        if(valor <= 0){
            throw new SaldoInsuficienteException("Valor informado deve ser real");
        } else if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo Insuficiente.");
        } else {
            saldo -= valor;
            return true;
        }
    }

    public void transferencia(ContaCorrente c, float valor)
            throws OperacaoIlegalException
    {
        try{
            saque(valor);
            c.deposita(valor);
        } catch (SaldoInsuficienteException e){
            throw new OperacaoIlegalException("Operação Ilegal!");
        }
    }
}
