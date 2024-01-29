package academy.devdojo.maratonajava.oop.test;

import academy.devdojo.maratonajava.oop.model.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();


        Calculadora calculadora1 = new Calculadora();
        calculadora1.imprimeDividaoDeDoisNumeros(20,12);
        System.out.println("/n");
        calculadora1.imprimeDividaoDeDoisNumeros(86,0);

    }
}
