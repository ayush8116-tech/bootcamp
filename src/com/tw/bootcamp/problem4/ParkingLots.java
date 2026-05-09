package com.tw.bootcamp.problem4;

import java.util.ArrayList;

public class ParkingLots {
    private final ArrayList<ParkingLot> parkingLotList;

    private ParkingLots(ArrayList<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    public static ParkingLots create(ArrayList<ParkingLot> parkingLotList) {
        return new ParkingLots(parkingLotList);
    }

    public boolean park(Car car) {
        for (ParkingLot parkingLot : parkingLotList) {
            if (!parkingLot.isFull()) {
                return parkingLot.park(car);
            }
        }

        throw new OutOfCapacityException("No Parking Lots Available");
    }


    public boolean isParkingLotAvailable() {
        for (ParkingLot parkingLot : this.parkingLotList) {
            if (!parkingLot.isFull()) {
                return true;
            }
        }

        return false;
    }
}

