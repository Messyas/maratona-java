package exercicios.ListaDeAlgoritmos;

/**
 * Exibir o produto dos números inteiros positivos no intervalo de um a cem.
 */
public class Ex02 {
    public static void main(String[] args) {
        int contagem = 100;
        int numero = 0;
        int produtoInteiros = 0;
        int proxNum = 0;
        int produtoDoIntervaloDezeroACem=0;
        while(numero<contagem) {
            numero++;
            proxNum++;
            produtoInteiros = (numero*proxNum);
            System.out.println("o numero" + numero + " X " + proxNum + " é igual a " + produtoInteiros);
            produtoDoIntervaloDezeroACem += produtoInteiros;

        }
        System.out.println("O produto dos numeros inteiros é " + produtoDoIntervaloDezeroACem);

    }

}
