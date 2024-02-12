package academy.devdojo.maratonajava.Javacore.Hheranca.dominio;

/**
 * Heranca: é o mesmo que dizer que um funcionario é uma pessoa, ou seja, as propriedades de uma classe extendem a de uma outra
 */

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicializacao estatico de Funcionario ");
    }

    {
        System.out.println("Dentro do bloco estatico de Funcionario ");
    }

    {
        System.out.println("Dentro do bloco estatico de Funcionario ");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construto de funcionario");
    }

    public void imprime() {
        super.imprime();
        //imprima o metodo da classe pai e depois imprima a seguir
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu "+this.getNome()+"recebi o salario de "+ this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
