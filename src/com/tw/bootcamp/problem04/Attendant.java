package com.tw.bootcamp.problem04;

import java.util.ArrayList;

public class Attendant {
    private final ArrayList<ParkingLot> parkingLotList;

    private Attendant(ArrayList<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    public static Attendant create(ArrayList<ParkingLot> parkingLotList) {
        return new Attendant(parkingLotList);
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (ParkingLot parkingLot : parkingLotList) {
            stringBuilder.append(parkingLot.isFull() ? "Full" : "Available").append("\n");
        }

        return stringBuilder.toString();
    }
}

