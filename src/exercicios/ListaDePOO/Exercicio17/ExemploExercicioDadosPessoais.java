package exercicios.ListaDePOO.Exercicio17;

public class ExemploExercicioDadosPessoais {
    private String nome;
    private String telefone;
    private int idade;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        if(idade >= 0 && idade <= 110){
            this.idade = idade;
        } else {
            System.out.println("Idade invalida. precisa estar entre 0 e 110 anos");
        }
    }
}
