package academy.devdojo.maratonajava.Javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissao no banco de dados");
    }

    @Override
    public void laod() {
        System.out.println("Carregando dados do banco de dados");
    }
}
