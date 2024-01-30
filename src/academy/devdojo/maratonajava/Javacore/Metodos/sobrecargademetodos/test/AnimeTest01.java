package academy.devdojo.maratonajava.Javacore.Metodos.sobrecargademetodos.test;

import academy.devdojo.maratonajava.Javacore.Metodos.sobrecargademetodos.dominio.Anime;

/**
 * sobrecarga de metodos é quando se usa o mesmo nome em um metodo, mas mudando o tipo ou a quantidade de parametros
 */
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("dbs","luta",317);
        anime.init("messyas", "nao sei", 19, "acao");


        anime.imprimir();
    }
}
