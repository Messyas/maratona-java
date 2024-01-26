package academy.devdojo.maratonajava.introducao;

/**
 * Matrizes multidimensinais, ou arraysMulttidimensionais sao estruturas de dados que sao dispostas em duas dimensoes
 *  nota: um espaço de memoria pode armazenar mais de um valor? alem de ter ele sobrescrito, qual é o limite para esse valor?
 */
public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 Meses
        //31,28,31,30 dias
        int[][] dias = new int [3][3]; // a base deve ter um tamanho para ser inicializo e nao ocorrer erro de compilacao
        dias[0][0] = 12;
        dias[0][1] = 28;
        dias[1][1] = 31;
        dias[1][2] = 23;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }

        }

        System.out.println("\n");

        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
