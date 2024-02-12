package academy.devdojo.maratonajava.Javacore.Dconstrutores.dominio;

/**
 * construtores
 */
public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //construtor
    public Anime(String nome, String tipo, int episodios,String genero){
        this();// primeiro a ser executado
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios,String genero, String estudio){
        this(nome, tipo, episodios, genero);//pega os dados ja criados do respectivo objeto
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.estudio = estudio;
    }
    //scorecard de construtores
    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");

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
