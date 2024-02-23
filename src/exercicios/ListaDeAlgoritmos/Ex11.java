package exercicios.ListaDeAlgoritmos;

/**
 * 11.Fazer um algoritmo para achar o fatorial de um número N.
 */
public class Ex11 {
    public static void main(String[] args) {
        int fatorial = 1;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é " + fatorial);
    }
}
