package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * 16.Fazer um algoritmo para verificar se um número lido é primo ou não. Número primo é aquele
 * que é divisível por 1 e por ele mesmo.
 */
public class Ex16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se é ou nao primo");
        int input = scanner.nextInt();
        if(input % 2 == 0) {
            System.out.println("O numero é primo! ");
        } else {
            System.out.println("O numero digitado nao é primo");
        }

    }
}
