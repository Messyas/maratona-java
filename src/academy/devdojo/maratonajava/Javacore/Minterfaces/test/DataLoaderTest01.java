package academy.devdojo.maratonajava.Javacore.Minterfaces.test;

import academy.devdojo.maratonajava.Javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.Javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.Javacore.Minterfaces.dominio.FileLoader;

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
    }
}
