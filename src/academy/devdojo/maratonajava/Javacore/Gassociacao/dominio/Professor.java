package academy.devdojo.maratonajava.Javacore.Gassociacao.dominio;
/**
 * Associacao unidirecional muitos para um n:1
 */

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
