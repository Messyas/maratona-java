package exercicios.ListaDeAlgoritmos;

import java.util.Scanner;

/**
 * Fazer um programa que leia a nota final de 50 alunos e escreva o total de aprovados. É
 * considerado aprovado o aluno com nota final maior ou igual a 6.
 *
 */

public class Ex09 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int nota;
        int quantidadeAlunosAprovados = 0;
        int mediaNota;
        int somaIdades = 0;

        while (true) {
            System.out.println("Digite a nota do aluno: ");
            nota = s.nextInt();

            if(nota==-1){
                System.out.println("Saindo...");
                break;
            }

            if(nota>=6) {
                quantidadeAlunosAprovados++;
                somaIdades+=nota;
            }
        }

        mediaNota = (somaIdades/quantidadeAlunosAprovados);
        System.out.println("A quantidade de alunos aprovados é " + quantidadeAlunosAprovados + " e a nota media dos aprovados é : " + mediaNota);

    }
}
