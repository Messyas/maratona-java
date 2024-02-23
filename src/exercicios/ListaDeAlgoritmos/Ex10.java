package exercicios.ListaDeAlgoritmos;

/**
 * Construa um algoritmo que leia um número inteiro N e imprima o mesmo na ordem inversa:
 * exemplo: dado 23457, a saída será 75432.
 */

public class Ex10 {
    public static void main(String[] args) {
        int i0 = 23457;
        int i = 0;

        while (i0 > 0) {
            i *= 10;
            i += (i0 % 10);
            i0 /= 10;
        }
        System.out.println(i);
   }
}
