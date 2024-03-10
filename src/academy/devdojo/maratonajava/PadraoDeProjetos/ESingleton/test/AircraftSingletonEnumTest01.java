package academy.devdojo.maratonajava.PadraoDeProjetos.ESingleton.test;

import academy.devdojo.maratonajava.PadraoDeProjetos.ESingleton.model.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeats("1A");
        bookSeats("1B");
        bookSeats("1B");

    }

    private static void bookSeats(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonEnum instace = AircraftSingletonEnum.INSTANCE;
        System.out.println(instace.bookSeats(seat));
    }
}

