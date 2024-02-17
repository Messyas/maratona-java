package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.som;

import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.som.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("ghish ghish ghisih");
    }
}
