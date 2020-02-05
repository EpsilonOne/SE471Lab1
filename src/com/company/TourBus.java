package com.company;

public class TourBus extends Bus {
    private final String type = "Tour Bus";
    private String company;
    private String renter;


    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRenter() {
        return renter;
    }

    public void setRenter(String renter) {
        this.renter = renter;
    }

}
