package academy.devdojo.maratonajava.Javacore.heranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public void imprime() {
        Pessoa p = new Pessoa();
        p.nome = "sasa";//acessando atributo protected da classe pessoa, so é possivel por estar no mesmo pacote
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
