package exercicios.ListaDeAlgoritmos;

/**
 * 13.Fazer um programa para achar a série de Bergamachi dos n primeiros termos: 1 1 1 1 3 5
 * 9 17 ...
 */
public class Ex13 {
    public static void main(String[] args) {
        int valorAntecessor = 1;
        int valorAtual = 1;
        int valorProx = 1;

        int bergamachi;

        int i = 0;
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

        while (i < 10) {
            bergamachi = (valorAntecessor + valorAtual + valorProx);
            System.out.println(bergamachi);
            valorAntecessor = valorAtual;
            valorAtual = valorProx;
            valorProx = bergamachi;
            i++;
        }

    }
}
