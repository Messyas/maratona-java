package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.voo;

public class FlyNoWay implements Flybehavior {
    @Override
    public void fly() {
        System.out.println("ficar paradinho, sei voar nao");
    }
}
