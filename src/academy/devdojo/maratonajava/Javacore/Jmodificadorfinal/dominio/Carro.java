package academy.devdojo.maratonajava.Javacore.Jmodificadorfinal.dominio;

/**
 * constantes: o modeficador final faz com que valores de uma variavel nao possam ser alterados em tempo de execucao
 */
public class Carro {
    private String nome;
    // geralmente constantes sao usadas com o modificador shatic junto, para que sejam inicializadas primeiro
    public static final double VELOCIDADE_LIMITE = 250.00;//velocidade limite nao vai mudar

    private static final double VELOCIDADE_MAX;//outra forma de inicializar uma constante, so funciona pois sempre static sera executado

    private final double VELOCIDADE_PRIME;

    public final Comprador COMPRADOR = new Comprador();// é o mesmo que dizer que a referencia da variavel comprador tem para o objeto instanciado Nunca vai poder ser alterado

    static {
        VELOCIDADE_MAX = 280;
    }

    public Carro() { //sem o static é possivel inicializar uma constante em um construtor
        VELOCIDADE_PRIME = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodo com final

    public final void imprime() {
        System.out.println(this.nome);
        System.out.println("Nao se pode sobrescrever este metodo");
    }
}
