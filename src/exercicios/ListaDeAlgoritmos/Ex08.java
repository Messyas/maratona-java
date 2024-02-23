package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * Fazer um programa que leia um conjunto de dados contendo o sexo e a altura de 50 pessoas.
 * Escreva a altura média das mulheres.
 */
public class Ex08 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        char sexo;
        int idade;
        int alturaMediaMulheres;
        int contaMulheres = 0;
        int alturaTotalMulheres = 0;

        while (true) {
            System.out.println("Digite o seu sexo");
            sexo = s.next().charAt(0);
            System.out.println("Digite a sua idade");
            idade = s.nextInt();

            if(idade==-1){
                System.out.println("Saindo ...");
                break;
            }

            if(sexo == 'F') {
                contaMulheres++;
                alturaTotalMulheres += idade;
            }
        }
        alturaMediaMulheres = (alturaTotalMulheres/contaMulheres);

        System.out.println("altura media das mulheres: " + alturaMediaMulheres);

    }
}
