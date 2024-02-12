package academy.devdojo.maratonajava.Javacore.Fmodificadorstatic.model;

/**
 * o modeficador static faz com que um atributo seja intrínseco a classe, ou seja o atributo pertence a classe em si, nao mais ao objeto inicializado.
 * todos os objetos vao compartilhar o mesmo valor da instancia da classe
 */
public class Carro {
    private String nome;
    private double valocidadeMaxima;
    public static double velocidadeLimite = 250; // inicializando o atributo como padrao em 250

    public Carro(String nome, double valocidadeMaxima) {
        this.nome = nome;
        this.valocidadeMaxima = valocidadeMaxima;
    }

    public void imprime() {
        System.out.println("---------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Maxima " + this.valocidadeMaxima);
        //para o modificador static, deve ser acessar o atributo usando a classe.
        System.out.println("Velocidade limite " + Carro.velocidadeLimite);

        //this nao deve ser usado da seguinte forma:
        //System.out.println("Velocidade Limite " + this.velocidadeLimite); por isso nao se pode utilizar this nesse caso, ja que ele se refere a instancia de cada atribuito
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValocidadeMaxima() {
        return valocidadeMaxima;
    }

    public void setValocidadeMaxima(double valocidadeMaxima) {
        this.valocidadeMaxima = valocidadeMaxima;
    }

}
