package academy.devdojo.maratonajava.Javacore.Minterfaces.dominio;

/**
 *
 */
public class DatabaseLoader implements DataLoader, DataRemover {
    //private -> default -> protected -> public
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

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize da classe");
    }// nao pode sobrescreever o metodo da interface dataLoader, no caso esse metodo é idenpendente da interface

}
