package academy.devdojo.maratonajava.Javacore.Isobrescrita.dominio;

/**
 * o metodo to string pode ser feito manualmetne sobrescrevendo da classe object
 */
public class Anime {
    private String nome;

    @Override
    public String toString() {//regras de sobrescrita do metodo to string,{1} = nome precisa ser o mesmo, {2} =
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
