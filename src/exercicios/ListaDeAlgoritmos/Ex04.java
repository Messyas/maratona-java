package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. Caso
 * contrário solicitar novamente apenas o segundo valor.
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n1 = scanner.nextInt();

        while (true) {
            System.out.println("Digite um numero");
            int n2 = scanner.nextInt();

            if (!(n2 < n1)) {
                System.out.println("Numero valido");
                break;
            } else {
                System.out.println("Digite um numero maior que o primeiro");
            }

        }

    }
}
