package academy.devdojo.maratonajava.Javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader{
    @Override
    public void laod() {
        System.out.println("Carregando dados do banco de dados");
    }
}
