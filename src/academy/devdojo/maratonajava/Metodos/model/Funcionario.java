package academy.devdojo.maratonajava.Metodos.model;

public class Funcionario {
    public String nome = null;
    public int idade = 0;
    public double[] salarios = null;

    public void imprimirDados() {
        System.out.println("O nome do funcionario é " + this.nome + " e sua idade é " + this.idade);
        if (salarios == null) {
            return; // o for estava dentro do if, para o jova o for é como se fosse uma linha de execucao
        }
        for (double salario : salarios) {
            System.out.println(salario + " ");

        }
        mediaSalarial();
    }

    public void mediaSalarial() {
        if (salarios == null) {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMedia salarial " + media);
    }
}
