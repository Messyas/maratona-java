package academy.devdojo.maratonajava.introducao;

/**
 * Notas: Arrays nao podem ser alterados de forma dinamica, isso significa que para um array ter seu valor modificado é necessario compilar o programa novamente.
 */
public class Aula07Arrays02 {
    public static void main(String[] args) {
        //padrao de inicializacao
        // byte, short, int, long, float e double 0
        // char '/u0000'
        //boolean false
        //String null


        String[] nomes = new String[4];
        nomes[0] = "Goku";// sao references
        nomes[1] = "Vegeta";
        nomes[2] = "Luffy";


        //iterando sobre um indice de um array
        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[6]; //isso passa um novo tamanho pro array, criando um novo objeto na memoria, isso mata o objeto anterior. ou seja os dados contidos no espaco de memoria anterior soa deletados pelo garbage colector

    }
}
