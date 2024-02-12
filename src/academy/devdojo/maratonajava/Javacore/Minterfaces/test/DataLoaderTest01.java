package academy.devdojo.maratonajava.Javacore.Minterfaces.test;

import academy.devdojo.maratonajava.Javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.Javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.Javacore.Minterfaces.dominio.FileLoader;

/**
 * Notes: Nao é possivel criar objetos a partir de uma interface
 */

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.laod();
        fileLoader.laod();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        databaseLoader.retrieveMaxDataSize();
    }
}
