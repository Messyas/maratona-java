package academy.devdojo.maratonajava.introducao;

//dado o valor de um carro, descubra em quantas ele pode ser parcelado
//condicao valorParcela >= 1000
public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 98.000;
        double parcelaCarro = 1200.00;
        int numeroDePar = 0;

        if (parcelaCarro >= 1000) {
            for (int i = 1; i < valorCarro; i++) { //de 1 ate i valor final
                numeroDePar = i;
            }
        }
        System.out.println("A quantidades de parcelas do vaiculo é: " + numeroDePar);

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal/ parcela;

            if(valorParcela >= 1000) {
                System.out.println("Parcele " + parcela+ " R$ "+valorParcela);
            } else {
                break;
            }
            System.out.println("Fora do if, mas dentro do for "+parcela);// o else para o circulo do for
        }

        for (int parcela = 1; parcela <= valorTotal; parcela++) {//forma melhorada
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcele " + parcela+ " R$ "+valorParcela);
        }
    }
}
