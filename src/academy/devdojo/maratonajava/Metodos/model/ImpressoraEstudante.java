package academy.devdojo.maratonajava.Metodos.model;

public class ImpressoraEstudante {
    public void imprimirEstudante(Estudante estudante) {
        System.out.println(" \n --------------------------------------------------------- \n" );
        System.out.println("O nome do estudante é " + estudante.nome + " e a idade é " + estudante.idade + " e seu Sexo é " + estudante.sexo);
    }
}
