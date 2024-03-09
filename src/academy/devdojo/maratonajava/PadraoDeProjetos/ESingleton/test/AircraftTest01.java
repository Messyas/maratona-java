package academy.devdojo.maratonajava.PadraoDeProjetos.ESingleton.test;

import academy.devdojo.maratonajava.PadraoDeProjetos.ESingleton.model.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

     static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeats(seat));
    }
}
