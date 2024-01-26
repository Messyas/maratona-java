package academy.devdojo.maratonajava.introducao;

/**
 * Pratica
 *
 * Crie variaveis para os campos descritos abaixo entre<> e imprima a seguinte mensagem:
 * Eu <nome>, morando no endereço <endereço>,
 * confirmo que recebi o salario de <salario> na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Messyas";
        String endereco = "Rua padre marcelo numero 14";
        double salatio = 4567.44;
        String data = "23/12/2025";
        String relatorio = "Eu "+ nome + ", morando no endereço " + endereco + " confirmo que recebi o salario de " + salatio + " na data " + data;

        System.out.println(relatorio);
    }
}
