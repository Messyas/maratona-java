package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //sintaxe de um array:
        //é uma variavel destinada a armazenar uma sequencia de dados
        //tipos referencia podem ser inicializados com null
        //arrays sao condiderados objetos aqui viu
        int [] idades = new int[3];// entre [ x ] fica definido o tamanho do array, que sao suas respectivas posicoes.
        idades[0] = 21;
        idades[1] = 22;
        idades[2] = 20;

        System.out.println("as idades continas no array: " +  idades[0]  +  idades[1] + idades[2]);
    }
}
