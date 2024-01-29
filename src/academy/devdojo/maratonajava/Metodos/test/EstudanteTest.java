package academy.devdojo.maratonajava.Metodos.test;

import academy.devdojo.maratonajava.Metodos.model.Estudante;
import academy.devdojo.maratonajava.Metodos.model.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Messyas";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "Amanda";
        estudante2.idade = 22;
        estudante2.sexo = 'F';

        impressora.imprimirEstudante(estudante1);
        impressora.imprimirEstudante(estudante2);

        System.out.println("\n-------------------");

        estudante1.imprimirDados();



    }
}
