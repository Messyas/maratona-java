package exercicios.ListaDeAlgoritmos;

/**
 * Exibir a soma dos números positivos no intervalo de um a cem.
 */
public class Ex01 {
    public static void main(String[] args) {
        int i = 0;
        int soma = 0;
        while (i <= 100) {
                System.out.println(i);
                i++;
                soma += i;
            }
        System.out.println("A soma total é: " + soma);
        }
    }

