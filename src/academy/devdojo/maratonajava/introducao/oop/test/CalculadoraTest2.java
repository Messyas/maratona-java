package academy.devdojo.maratonajava.introducao.oop.test;

import academy.devdojo.maratonajava.introducao.oop.model.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,2));

        //ou use um casting
        int resultado = (int) calculadora.divideDoisNumeros(20,2);
        System.out.println(resultado);
    }
}
