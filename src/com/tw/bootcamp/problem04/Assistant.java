package com.tw.bootcamp.problem04;

public class Assistant {
    private String parkingLotData;

    public Assistant(String parkingLotData) {
        this.parkingLotData = parkingLotData;
    }

    public void updateDisplay(String newData) {
        parkingLotData = newData;
    }
}
