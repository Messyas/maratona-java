package academy.devdojo.maratonajava.Javacore.Metodos.sobrecargademetodos.construtores.teste;


import academy.devdojo.maratonajava.Javacore.Metodos.sobrecargademetodos.construtores.dominio.Anime;

/**
 * o uso de construtores obriga que um objeto tenha seus atributos inicializados na construcao do objeto
 */
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Kaiki no kousin", "nao sei", 12, "amizade");


        anime.imprimir();

    }
}
