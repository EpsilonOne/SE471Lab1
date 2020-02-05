package com.company;

public class Schedule {
    private int scheduleNumber;
    private String startTime;
    private ScheduledTrip sTrip;
    private  Vehicle vehicle;

    public static void main(String[] args) {

    }

    public int getScheduleNumber() {
        return scheduleNumber;
    }

    public void setScheduleNumber(int scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


}
