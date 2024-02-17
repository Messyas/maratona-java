package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks;


import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.som.Quack;
import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.voo.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flybehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("EU SOU O MALLARDDUCK jajaiouewhfrui");
    }
}
