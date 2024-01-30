package academy.devdojo.maratonajava.Javacore.blocosdeinicializacao.dominio;

/**
 * blocos de iniciazacao
 */
public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - alocado espaco em memoria pro objeto
    // 2 -Cada atrinuto de  classe é criado e inicializado com valores de default ou com o que for passado
    // 3 - o bloco de inicializacao é executado
    // 4 - Construtor é inicializado
    {
        //bloco de inicializacao de instancia, é executado toda vez que uma instancia da classe é criada, e é executado antes do construtor
        //isso permite inicializar atributos fora de um construtor, fazendo com que nao seja necessario escrever o mesmo codigo mais de uma vez
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];//inicializa um objeto array de tamanho 100
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;//itera sobre episodios
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
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
