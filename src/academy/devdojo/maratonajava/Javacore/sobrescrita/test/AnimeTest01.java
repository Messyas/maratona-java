package academy.devdojo.maratonajava.Javacore.sobrescrita.test;

import academy.devdojo.maratonajava.Javacore.sobrescrita.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("DR stone");
        anime.toString();//metodo to string
        System.out.println(anime);
    }
}
