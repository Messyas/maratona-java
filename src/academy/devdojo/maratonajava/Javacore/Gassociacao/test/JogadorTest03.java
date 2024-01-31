package academy.devdojo.maratonajava.Javacore.Gassociacao.test;

import academy.devdojo.maratonajava.Javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.Javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        //referenciamento (1 percente a tal 1)

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("------- Jogador --------");

        jogador.imprime();

        System.out.println("------- Time --------");

        time.imprime();

    }
}
