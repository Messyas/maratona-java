package exercicios;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor original do produto: ");
        float valor = in.nextFloat();
        float taxa;
        if(valor > 0 && valor <= 30) {
            taxa = 1.09f;
        } else if (valor > 30 && valor < 68) {
            taxa = 1.37f;
        } else {
            taxa = 1.49f;
        }

        System.out.println("O valor corrigido é: " + valor * taxa);
    }
}
