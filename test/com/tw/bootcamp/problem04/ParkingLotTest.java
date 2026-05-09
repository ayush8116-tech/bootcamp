package com.tw.bootcamp.problem04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void shouldParkACar_whenCarIsGiven() {
        ParkingLot parkingLot = new ParkingLot(30);
        Car car = new Car();

        assertTrue(parkingLot.park(car));
    }

    @Test
    void shouldReturnTrue_whenLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        parkingLot.park(car);
        assertTrue(parkingLot.isFull());
    }

    @Test
    void shouldReturnFalse_whenLotIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(30);
        assertFalse(parkingLot.isFull());
    }

    @Test
    void shouldThrowError_whenTryingToParkACarInAFullParkingLot() {
        OutOfCapacityException exception = assertThrows(OutOfCapacityException.class, () -> {
            ParkingLot parkingLot = new ParkingLot(1);
            Car car1 = new Car();
            Car car2 = new Car();
            parkingLot.park(car1);
            parkingLot.park(car2);
        });

        assertEquals("Parking Lot is Full", exception.getMessage());
    }
}