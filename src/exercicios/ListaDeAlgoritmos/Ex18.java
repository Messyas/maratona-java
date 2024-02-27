package exercicios.ListaDeAlgoritmos;

/**
 *18.Qualquer número natural de quatro algarismos pode ser dividido em duas dezenas pelos seus
 * dois primeiro e dois últimos dígitos. Exemplo: 1456 : 14 e 56. Construa um algoritmo que
 * imprima todos os números de quatro algarismos cuja raiz quadrada seja a soma das dezenas
 * formadas pela divisão acima. Exemplo: raiz de 9801 = 99 = 98 + 01.
 */
public class Ex18 {
    public static void main(String[] args) {
        for(int num = 1000; num < 10000; num++) {
            int dezenaEsquerda = num / 100;
            int dezenaDireita = num % 100;
            int raizQuadrada = (int) Math.sqrt(num);
            if(raizQuadrada * raizQuadrada == num && raizQuadrada == dezenaEsquerda + dezenaDireita);
            System.out.println(num);
        }
    }
}
