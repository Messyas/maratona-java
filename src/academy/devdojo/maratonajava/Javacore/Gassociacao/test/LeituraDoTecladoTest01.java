package academy.devdojo.maratonajava.Javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo: ");
        String nome = entrada.nextLine();

        System.out.println("Digite dua idade");
        int idade = entrada.nextInt();

        System.out.println("Digite seu sexo(m ou s)");
        char sexo = entrada.next().charAt(0);//string é um array de caracteres
        System.out.println("------------------------------");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Sexo " + sexo);

    }
}
