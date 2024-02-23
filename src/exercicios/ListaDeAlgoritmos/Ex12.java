package exercicios.ListaDeAlgoritmos;

/**
 * Fazer um programa para achar a série de Fibonacci dos n primeiros termos: 1 1 2 3 5 8
 * 13 ...
 */
public class Ex12 {
    public static void main(String[] args) {
        int termoAtual = 0;
        int proximoTermo = 1;
        int fibo = 0;
        int i = 0;

        while(i < 10) {
            fibo = (termoAtual + proximoTermo);
            System.out.println(fibo);
            termoAtual = proximoTermo;
            proximoTermo = fibo;
            i++;
        }

    }
}

