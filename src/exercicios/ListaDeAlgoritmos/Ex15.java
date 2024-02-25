package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * 15.A série de Fetuccine difere da série de Ricci porque o termo de posição par é resultado da
 * subtração dos dois anteriores. Os termos ímpares continuam sendo o resultado da soma dos
 * dois elementos anteriores. Imprima os n primeiros termos da série de Fetuccine.
 */

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termoAtual = 0;
        int proximoTermo = 1;
        int fetuccine;
        int i = 0;

        System.out.println("Digite o numero de termos para a serie de Fetuccine");
        int input = scanner.nextInt();


        while(i < input) {
            if(proximoTermo % 2 == 0) {
                fetuccine = (termoAtual - proximoTermo);
                System.out.println(fetuccine);

            } else {
                fetuccine = (termoAtual + proximoTermo);
                System.out.println(fetuccine);
            }
            termoAtual = proximoTermo;
            proximoTermo = fetuccine;
            i++;
        }
    }
}

/*  public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termoAtual = 0;
        int proximoTermo = 1;
        int fetuccine;

        System.out.println("Digite o número de termos para a série de Fetuccine:");
        int input = scanner.nextInt();

        System.out.println("Os " + input + " primeiros termos da série de Fetuccine são:");

        for (int i = 0; i < input; i++) {
            if (i % 2 == 0) {
                fetuccine = termoAtual - proximoTermo;
                System.out.println(fetuccine);
            } else {
                fetuccine = termoAtual + proximoTermo;
                System.out.println(fetuccine);
            }
            termoAtual = proximoTermo;
            proximoTermo = fetuccine;
        }
    }
}
*/