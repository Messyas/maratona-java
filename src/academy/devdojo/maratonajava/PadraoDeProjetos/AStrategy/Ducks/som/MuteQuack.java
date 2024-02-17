package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.som;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Nao sei voar nao man");
    }
}
