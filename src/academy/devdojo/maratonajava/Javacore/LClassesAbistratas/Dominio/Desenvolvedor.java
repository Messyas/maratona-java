package academy.devdojo.maratonajava.Javacore.LClassesAbistratas.Dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        this.salario = this.salario + this.salario * 0.5;
        return 0;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

}
