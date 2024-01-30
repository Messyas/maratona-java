package academy.devdojo.maratonajava.Javacore.Metodos.sobrecargademetodos.construtores.dominio;

/**
 * construtores
 */
public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //construtor
    public Anime(String nome, String tipo, int episodios,String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    //sobrecarga de construtores
    public Anime() {

    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
