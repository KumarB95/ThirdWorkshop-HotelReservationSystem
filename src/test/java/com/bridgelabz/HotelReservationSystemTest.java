package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {
    HotelReservationSystem Obj = new HotelReservationSystem();

    @Test
    void checkAllThreeHotelsAreAdded(){
        Obj.addHotelDetails();
        Assertions.assertEquals( 3, Obj.hotelList.size());
    }
    @Test
    void checkCheapestHotel(){
        Obj.findCheapestHotel();
    }
}
