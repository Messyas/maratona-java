package academy.devdojo.maratonajava.introducao.oop.test;

import academy.devdojo.maratonajava.introducao.oop.model.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Professor professor2 = new Professor();

        professor = professor2;

        professor.nome = "Mestre Kami";
        professor.idade = 130;
        professor.sexo = 'M';
        System.out.println("Nome " + professor.nome + " Idade " + professor.idade + " Sexo " +professor.sexo);

    }
}
