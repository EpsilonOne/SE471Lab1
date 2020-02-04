package com.company;

import java.awt.*;

public class ScheduledTrip extends Trip {
    private List unscheduledTrips;

    public List getScheduledTrips() {
        return unscheduledTrips;
    }

    public void addTrip(Trip t) {
        unscheduledTrips.add(String.valueOf(t));
    }

}
