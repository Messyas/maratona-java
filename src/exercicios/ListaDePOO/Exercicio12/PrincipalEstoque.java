package exercicios.ListaDePOO.Exercicio12;

import exercicios.ListaDePOO.Exercicio11.Estoque;

public class PrincipalEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("iphone", 2300,10);
        Estoque estoque2 = new Estoque("rtx4090", 22300,13);
        Estoque estoque3 = new Estoque("ryzen 7 7800x3d", 2340,13);

        estoque.imprimir();
        System.out.println("\n");
        estoque2.imprimir();
        System.out.println("\n");
        estoque3.imprimir();

        System.out.println("-----------------------------\n");

        estoque.removerProdutos(12);
        estoque2.removerProdutos(12);
        estoque3.removerProdutos(2);

        System.out.println("-----------------------------\n");

        estoque.imprimir();
        System.out.println("\n");
        estoque2.imprimir();
        System.out.println("\n");
        estoque3.imprimir();




    }
}
