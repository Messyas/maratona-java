package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * 14.A série de Ricci difere da série de Fibonacci porque os dois primeiros termos podem ser
 * definidos pelo usuário. Imprima os n primeiros termos da série de Ricci.
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termoAtual = 0;
        int proximoTermo = 1;
        int fibo;
        int i = 0;

        System.out.println("Digite o numero de termos para a serie de Ricci");
        int input = scanner.nextInt();
        if(input > 50) {
            System.out.println("Numero muito grande, o risco de estourar a memoria ja é grande, tenha cuidado");
        }

        while(i < input) {
            fibo = (termoAtual + proximoTermo);
            System.out.println(fibo);
            termoAtual = proximoTermo;
            proximoTermo = fibo;
            i++;
        }
    }
}
