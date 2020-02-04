package com.company;

public class Airplane extends Vehicle {
    private int flightNumber;
    private  String  hangar;
    private String boardingGroup;

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getHangar() {
        return hangar;
    }

    public void setHangar(String hangar) {
        this.hangar = hangar;
    }

    public String getBoardingGroup() {
        return boardingGroup;
    }

    public void setBoardingGroup(String boardingGroup) {
        this.boardingGroup = boardingGroup;
    }
}
