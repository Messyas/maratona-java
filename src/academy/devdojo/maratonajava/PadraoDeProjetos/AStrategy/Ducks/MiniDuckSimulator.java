package academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks;

import academy.devdojo.maratonajava.PadraoDeProjetos.AStrategy.Ducks.voo.FlyRocketPowed;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\n");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlybehavior(new FlyRocketPowed());
        model.performFly();
    }
}
