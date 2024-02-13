package exercicios.ListaDePOO.Exercicio06;

import exercicios.ListaDePOO.Exercicio05.Computador;

public class PrincipalComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("HP", "White", "IMS22", 123332, 21.000);

        computador.imprimir();
        computador.calcularValor();
        computador.imprimir();

        System.out.println("\n");

        Computador computador2 = new Computador("IBM", "Preto", "IX012", 1232432, 23.000);

        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();
        int resultado = computador2.alterarValor(24.000);
        if (resultado == 1) {
            System.out.println("Valor retornado com sucesso");
        } else {
            System.out.println("Valor invalido");
        }
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();

    }
}
