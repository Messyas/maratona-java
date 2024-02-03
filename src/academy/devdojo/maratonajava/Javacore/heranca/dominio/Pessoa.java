package academy.devdojo.maratonajava.Javacore.heranca.dominio;

/**
 * Protected: faz com que os atributos de uma superclasse possam ser acessados diretamete por todas as subclasses. Devem estar no mesmo pacote
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
