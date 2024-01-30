package academy.devdojo.maratonajava.Javacore.Gassociacao.test;

import academy.devdojo.maratonajava.Javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.Javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Cruzeiro");
        jogador1.setTime(time);
        jogador1.imprime();


    }
}
