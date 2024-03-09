package academy.devdojo.maratonajava.PadraoDeProjetos.ESingleton.test;
import academy.devdojo.maratonajava.PadraoDeProjetos.ESingleton.model.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeats(seat));
    }
}
