package exercicios.ListaDeAlgoritmos;

/**
 * Elaborar um programa que apresente no final o somatório dos valores pares existentes entre
 * 1 e 500.
 */
public class Ex03 {
    public static void main(String[] args) {
        int valoresPares = 0;
        int contador = 0;
        while (contador < 500) {
            if(contador % 2 == 0) {
                valoresPares += contador;
            }
            contador++;
        }
        System.out.println("Valores pares: " + valoresPares);
    }
}
