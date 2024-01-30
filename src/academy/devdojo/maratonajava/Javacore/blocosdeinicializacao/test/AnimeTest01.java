package academy.devdojo.maratonajava.Javacore.blocosdeinicializacao.test;


import academy.devdojo.maratonajava.Javacore.blocosdeinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }


    }
}
