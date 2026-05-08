package com.tw.bootcamp.problem4;

import java.util.ArrayList;

public class ParkingLot {
    private final int capacity;
    private final ArrayList<Car> parkedCars;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        parkedCars = new ArrayList<>(capacity);
    }

    public int park(Car car) {
        if(isFull()) throw new OutOfCapacityException("Parking Lot is Full");

        parkedCars.add(car);
        return parkedCars.size();
    }

    public boolean isFull() {
        return parkedCars.size() == capacity;
    }
}
