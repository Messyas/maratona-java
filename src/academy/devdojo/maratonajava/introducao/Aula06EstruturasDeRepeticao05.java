package academy.devdojo.maratonajava.introducao;
//continue
//dado o valor de um carro, descubra em quantas ele pode ser parcelado
//condicao valorParcela >= 1000
public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; valorTotal >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                continue; // faz com que o loop continue enquanto a condicao nao for atendida
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
