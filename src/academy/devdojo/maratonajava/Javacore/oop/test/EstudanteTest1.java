package academy.devdojo.maratonajava.Javacore.oop.test;

import academy.devdojo.maratonajava.Javacore.oop.model.Estudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Messyas";
        estudante.idade = 20;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
