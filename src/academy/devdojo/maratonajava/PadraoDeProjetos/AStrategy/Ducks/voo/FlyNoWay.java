package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.voo;

import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.voo.Flybehavior;

public class FlyNoWay implements Flybehavior {
    @Override
    public void fly() {
        System.out.println("ficar paradinho, sei voar nao");
    }
}
