package exercicios.ListaDePOO.Exercicio02;

import exercicios.ListaDePOO.Exercicio01.Apolice;

public class PrincipalApolice {
    public static void main(String[] args) {
        Apolice apolice = new Apolice("Messyas Gois Franca", 18, 2000);

        apolice.imprimir();
        apolice.calcularPremioApolice();
        apolice.imprimir();
        apolice.oferecerDesconto("Curitiba");
        apolice.imprimir();

    }
}
