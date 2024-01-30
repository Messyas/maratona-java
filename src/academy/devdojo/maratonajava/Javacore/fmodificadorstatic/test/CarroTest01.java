package academy.devdojo.maratonajava.Javacore.fmodificadorstatic.test;

/**
 * metodos estaticos(static) sao compilados idepedentemente da classe.
 * podem ser implementados quando um metodos nao acessam os atributos da instancia da classe.
 */

import academy.devdojo.maratonajava.Javacore.fmodificadorstatic.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(190);
        Carro c1 = new Carro("bmw",280);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Audi",290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
