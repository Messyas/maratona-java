package academy.devdojo.maratonajava.Javacore.Fmodificadorstatic.model;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0 - Bloco de inicializacao é executado quando a jvm carregar classe
    // 1 - alocado espaco em memoria pro objeto
    // 2 -Cada atrinuto de  classe é criado e inicializado com valores de default ou com o que for passado
    // 3 - o bloco de inicializacao é executado
    // 4 - Construtor é inicializado
   //bloco de inicializacao estatico, é executado apenas uma vez, quando a classe é compilada pela jvm, antes de ter espaco em memoria alocado para um objeto, isso acontece para todos os atributos e metodos estaticos
   static { //nao se pode acessar atributos de instancias pois as instancias ainda nao foram carregadas no momento da execucao atual
        System.out.println("Dentro do bloco de inicializacao 1");
        episodios = new int[100];//inicializa um objeto array de tamanho 100
        for (
                int i = 0;
                i < episodios.length; i++) {
            episodios[i] = i + 1;//itera sobre episodios
        }
    }

    static {
        System.out.println("Dentro do bloco 2");
    }

    static {
        System.out.println("Dentro do bloco 3");
    }

    {
        System.out.println("Bloco de inicializacao nao estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
