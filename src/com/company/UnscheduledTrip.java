package com.company;

import java.awt.*;
import java.util.ArrayList;

public class UnscheduledTrip extends Trip {
    private ArrayList<Trip> unscheduledTrips;


    public ArrayList<Trip> getUnscheduledTrips() {
        return unscheduledTrips;
    }

    public void setUnscheduledTrips(ArrayList<Trip> unscheduledTrips) {
        this.unscheduledTrips = unscheduledTrips;
    }
}
