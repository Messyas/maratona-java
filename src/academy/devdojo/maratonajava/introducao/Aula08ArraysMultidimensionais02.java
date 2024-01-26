package academy.devdojo.maratonajava.introducao;

/**
 * Dessa forma por exemplo, é possivel fazer uma fila de times de fudebol e iterar sobre ela, imprimindo assim sua ordem.
 */
public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,2,3};
        arrayInt[2] = array;

        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6,7}};

        for(int[] arrayBase: arrayInt) {
            System.out.println("\n-----");
            for(int num: arrayBase) {
                System.out.print(num + " ");
            }
        }

        for(int[] arrayBase: arrayInt2) {
            System.out.println("\n-----");
            for(int num: arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
