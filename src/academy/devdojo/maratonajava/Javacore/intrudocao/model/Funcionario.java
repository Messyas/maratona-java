package academy.devdojo.maratonajava.Javacore.intrudocao.model;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double[] salarios = null;
    private double media = 0;

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

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMedia salarial " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
