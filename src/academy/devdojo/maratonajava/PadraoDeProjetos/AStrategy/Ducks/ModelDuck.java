package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks;

import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.som.Quack;
import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.voo.FlyNoWay;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flybehavior =  new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    void display() {
        System.out.println("Isso é um model duck");
    }
}
