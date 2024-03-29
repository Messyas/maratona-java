package academy.devdojo.maratonajava.Javacore.LClassesAbistratas.Dominio;

/**
 * Classes abstratas: sao abistracoes que representam entidades que representam conceitos amplos, ex: funcionario, carro, peças etc.
 * Nao podem ser instanciadas diretamente, nao pode existir um objeto funcinario.
 * sao criadas para ser superclasses
 */
public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract double calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }
}
