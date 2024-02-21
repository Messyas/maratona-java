package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * Fazer um programa que leia 20 idades de pessoas. Calcule e escreva a idade média deste
 * grupo.
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int idade = 0;
        int totalIdades = 0;
        int quanPessoas = 0;
        while (contador <= 20) {
            System.out.println("Digite a sua idade");
            idade = scanner.nextInt();
            totalIdades += idade;
            quanPessoas++;
            contador++;
        }
        int mediaIdades = (totalIdades/quanPessoas);
        System.out.println("A media entre as idades é " + mediaIdades);
    }
}
