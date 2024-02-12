package academy.devdojo.maratonajava.Javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void laod() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("chegando permissao para acessar o arquivo"); //essa implementacao sobreescreve o metodo da interface dataLoader
    }

    @Override
    public void remove() {
        System.out.println("Deletando os dados de um arquivo");
    }
}
