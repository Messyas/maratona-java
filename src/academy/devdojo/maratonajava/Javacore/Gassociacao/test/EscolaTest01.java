package academy.devdojo.maratonajava.Javacore.Gassociacao.test;
/**
 * Associacao unidirecional muitos para um n:1
 */
import academy.devdojo.maratonajava.Javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.Javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Chamy");
        Professor professor2 = new Professor("Andrea");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Ifam", professores);
        escola.imprime();


    }
}
