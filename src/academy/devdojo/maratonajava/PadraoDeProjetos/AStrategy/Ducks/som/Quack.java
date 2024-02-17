package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.som;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack quack quack");
    }
}
