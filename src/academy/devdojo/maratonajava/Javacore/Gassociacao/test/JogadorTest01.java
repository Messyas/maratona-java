package academy.devdojo.maratonajava.Javacore.Gassociacao.test;

import academy.devdojo.maratonajava.Javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        //associacao
        for(Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
