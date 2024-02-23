package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * Fazer um programa que leia um conjunto de idades de pessoas. O final do conjunto de valores
 * é conhecido através do valor -1. Calcule e escreva a idade média deste conjunto.
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = 0;
        int quantidade = 0;
        int valorTotal = 0;
        int mediaIdades;

           while(input!= -1) {
               System.out.println("Digite a sua idade: ");
               input = s.nextInt();

               quantidade++;
               valorTotal += input;
           }
           mediaIdades = (valorTotal/quantidade);

        System.out.println("A media entre as idades é: " + mediaIdades);

    }
}
