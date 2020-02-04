package com.company;

public class CharteredBus {
    private final String type = "Charter Bus";
    private String renter;
    private String start;
    private  String end;

    public String getType() {
        return type;
    }

    public String getRenter() {
        return renter;
    }

    public void setRenter(String renter) {
        this.renter = renter;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
