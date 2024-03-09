package academy.devdojo.maratonajava.PadraoDeProjetos.ESingleton.test;

import academy.devdojo.maratonajava.PadraoDeProjetos.ESingleton.model.AircraftSingletonLazy;

import java.lang.reflect.Constructor;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazy);
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraft.bookSeats(seat));
    }
}
