package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks;

import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.som.QuackBehavior;
import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.voo.Flybehavior;

public abstract class Duck  {
    Flybehavior flybehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    abstract void display();

    public void performFly() {
        flybehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlybehavior(Flybehavior fb) {
        flybehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
