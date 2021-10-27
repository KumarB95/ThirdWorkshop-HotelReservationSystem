package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {
    HotelReservationSystem hotelReservation = new HotelReservationSystem();
    @Test
    public void add_Hotels() {
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", "LakeWood", 110, 110)));
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", "Bridgewood", 110, 160)));
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", "Ridgewood", 110, 220)));
    }

    @Test
    public void toFindTheCheapestHotel() {
        HotelReservationSystem cheapHotel = new HotelReservationSystem();
        cheapHotel.findCheapestHotel();
    }
    @Test
    public void addWeekdayAndWeekendRate() {
        HotelReservationSystem weekdayWeekend = new HotelReservationSystem();
        weekdayWeekend.weekday_weekend_rate();
    }
    @Test
    public void toFindTheCheapestHotel_OnWeekdayAndWeekend() {
        HotelReservationSystem cheapHotel = new HotelReservationSystem();
        cheapHotel.cheapestWeekdayWeekendHotel();
    }
}
