package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos numeros pares de arte 1000

        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) { //numero dividio por 2, se o resto for diferente de 0 significa que ele nao é par
                System.out.println("Numero: "+ i);

                if(i > 80) {
                    System.out.println("Hora de acabar!");
                    break;
                }
            }
        }
    }
}
