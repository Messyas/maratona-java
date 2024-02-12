package academy.devdojo.maratonajava.Javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.Javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        Repositorio repositorio2 = new RepositorioArquivo();
        repositorio2.salvar();
        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio3.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("sdfasf");
        list.add("sonic");
        System.out.println(list);
    }
}
