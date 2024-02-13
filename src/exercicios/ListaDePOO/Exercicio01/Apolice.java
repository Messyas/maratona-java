package exercicios.ListaDePOO.Exercicio01;


public class Apolice {
    private final String nomeSegurado;
    private final int idade;
    private double valorPremio;

    public Apolice(String nomeSegurado, int idade, double valorPremio) {
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    public void imprimir() {
        System.out.println("Nome do segurado: "+ this.nomeSegurado);
        System.out.println("idade do segurado: "+ this.idade);
        System.out.println("valor do premio: "+ this.valorPremio);
    }

    public void calcularPremioApolice() {
        if(idade >= 18 && idade <= 25) {
            this.valorPremio += (valorPremio*20/100);
        } else if (idade > 25 && idade <= 36) {
            this.valorPremio += (valorPremio*15/100);
        } else if (idade > 36){
            this.valorPremio += (valorPremio*10/100);
        }
    }

    public void oferecerDesconto(String cidade) {
        switch (cidade) {
            case "Curitiba":
                this.valorPremio -= (valorPremio * 0.20);
                System.out.println("Desconto de 20% aplicado para a sua cidade ");
                break;
            case "Rio de janeiro":
                this.valorPremio -= (valorPremio * 0.15);
                System.out.println("Desconto de 15% aplicado para a sua cidade");
                break;
            case "Sao paulo":
                this.valorPremio -= (valorPremio * 0.10);
                System.out.println("Desconto de 10% aplicado para a sua cidade");
                break;
            case "Belo horizonte":
                this.valorPremio -= (valorPremio * 0.5);
                System.out.println("Desconto de 5% aplicado para a sua cidade");
                break;
            default:
                System.out.println("Nenhum desconto aplicado ");
        }

    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }


}
