package academy.devdojo.maratonajava.oop.test;

import academy.devdojo.maratonajava.oop.model.Calculadora;

/**
 * Em java, quando se passa um argumento com um tipo primitivo, nao se passa uma referencia, e sim é feita uma copia dos valores para o metodo
 */
public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);

        System.out.println(num1);
        System.out.println(num2);

    }
}
