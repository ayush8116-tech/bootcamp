package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotsTest {

    @Test
    void shouldReturnTrue_whenParkACarInFirstParkingLot() {
        Car car = new Car();
        ParkingLot parkingLot1 = new ParkingLot(50);
        ParkingLot parkingLot2 = new ParkingLot(50);
        ArrayList<ParkingLot> parkingLotList = new ArrayList<>();
        parkingLotList.add(parkingLot1);
        parkingLotList.add(parkingLot2);

        ParkingLots parkingLots = ParkingLots.create(parkingLotList);
        assertTrue(parkingLots.park(car));
    }

    @Test
    void shouldReturnTrue_whenParkACarInSecondParkingLot() {
        Car car = new Car();
        ParkingLot parkingLot1 = new ParkingLot(0);
        ParkingLot parkingLot2 = new ParkingLot(20);

        ArrayList<ParkingLot> parkingLotList = new ArrayList<>();
        parkingLotList.add(parkingLot1);
        parkingLotList.add(parkingLot2);
        ParkingLots parkingLots = ParkingLots.create(parkingLotList);

        assertTrue(parkingLots.park(car));
    }
}