package academy.devdojo.maratonajava.Javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.Javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando no banco de dados");
    }
}
