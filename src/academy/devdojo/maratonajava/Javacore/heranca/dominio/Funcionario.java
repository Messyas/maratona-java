package academy.devdojo.maratonajava.Javacore.heranca.dominio;

/**
 * Heranca: é o mesmo que dizer que um funcionario é uma pessoa, ou seja, as propriedades de uma classe extendem a de uma outra
 */

public class Funcionario extends Pessoa {
    private double salario;

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
