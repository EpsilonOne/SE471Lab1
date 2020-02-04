package com.company;

public class Schedule {
    private int scheduleNumber;
    private String startTime;

    public Schedule(int scheduleNumber, String startTime) {
        this.scheduleNumber = scheduleNumber;
        this.startTime = startTime;
    }


    public static void main(String[] args) {
	// write your code here
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
