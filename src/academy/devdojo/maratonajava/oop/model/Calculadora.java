package academy.devdojo.maratonajava.oop.model;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subitraiNumeros() {
        System.out.println(21 - 12);
    }

    public void multiplicacao(int numero1, int numero2) {
        System.out.println(numero1 * numero2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void imprimeDividaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
            return; //isso so funciona se o metodo for void
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int numero1, int num2) {
        numero1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteradoisnumeros: ");
        System.out.println("Num1 "+ numero1);
        System.out.println("Num2 "+ num2);
    }
}
