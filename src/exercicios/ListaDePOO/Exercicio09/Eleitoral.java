package exercicios.ListaDePOO.Exercicio09;

public class Eleitoral {
    private String nome;
    private double idade;

    public Eleitoral(String nome, double idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        verificar();
    }

    public void verificar(){
        if(this.idade>16) {
            System.out.println("Eleitor nao pode votar");
        } else if (this.idade<=16 && this.idade<65) {
            System.out.println("Eleitor deve votar");
        } else {
            System.out.println("Voto facultativo");
        }
    }
}
