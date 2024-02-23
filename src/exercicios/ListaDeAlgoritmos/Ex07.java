package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * Fazer um programa que leia um conjunto de alturas de pessoas. O final do conjunto de valores
 * é conhecido através do valor zero. Escreva a menor altura deste conjunto.
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double altura = 0;
        int contaAltura=0;

        double mediaAltura = 0;

        int input = -1;

        while (true) {
            System.out.println("Digite a sua altura: ");
            input = s.nextInt();
            if(input==0){
                System.out.println("Saindo . . .");
                break;
            }
            if(input>0) {
                altura += input;
            }
            contaAltura++;
            mediaAltura = (altura/contaAltura);
        }
        System.out.println("A media das alturas é: " + mediaAltura);

    }
}
