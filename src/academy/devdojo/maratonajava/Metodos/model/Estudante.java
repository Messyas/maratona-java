package academy.devdojo.maratonajava.Metodos.model;

public class Estudante {
    public String nome = "Estudante";
    public int idade;
    public char sexo;

    public void imprimirDados() {
        System.out.println(this.nome + " " + this.idade + " " + this.sexo);

    }
}
