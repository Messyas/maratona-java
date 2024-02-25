package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * 17.Fazer um algoritmo para verificar se um número lido é número perfeito. Número perfeito é
 * aquele que é igual a soma dos seus divisores. Por exemplo: 6 = 1 + 2 + 3
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se é perfeito: ");
        int numero = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i < numero; i++) {
            if(numero % i == 0) { //veridica se o numero atual divido pelo indice é divisivel, caso seja sera somado a variavel
                soma += i;
            }
        }

        System.out.println("A soma dos divisores é " + soma);

        if (soma == numero) {
            System.out.println("O numero é perfeito");
        } else {
            System.out.println("O numero nao é perfeito");
        }

    }
}
