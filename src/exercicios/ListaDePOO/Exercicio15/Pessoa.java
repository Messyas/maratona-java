package exercicios.ListaDePOO.Exercicio15;

public class Pessoa {
    private String cpf;
    private String nome;
    private String dataNasc;

    public Pessoa(String cpf, String nome, String dataNast) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNast;
    }

    public Pessoa(){

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}
