package academy.devdojo.maratonajava.Javacore.Eblocosdeinicializacao.test;


import academy.devdojo.maratonajava.Javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }


    }
}
