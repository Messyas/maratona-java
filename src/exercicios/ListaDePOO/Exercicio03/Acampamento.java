package exercicios.ListaDePOO.Exercicio03;

public class Acampamento {
    private final String nome;
    private String equipe;
    private final int idade;

    public Acampamento(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

   public void imprime() {
       System.out.println("Nome " + this.nome);
       System.out.println("Equipe " + this.equipe);
       System.out.println("Idade " + this.idade);
   }

    public void separarGrupo() {
        if(idade >= 6 && idade <= 10) {
            System.out.println("Selecionado para a equipe A");
            this.equipe = "A";
        } else if (idade >= 11 && idade <= 20) {
            System.out.println("Selecionado para a equipe B");
            this.equipe = "B";
        } else if (idade > 21) {
            System.out.println("Selecionado para a equipe C");
            this.equipe = "C";
        } else {
            System.out.println("Idade invalida");
        }
    }
}
