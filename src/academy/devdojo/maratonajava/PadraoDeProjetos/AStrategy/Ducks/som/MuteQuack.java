package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.som;

import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.som.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Nao sei voar nao man");
    }
}
