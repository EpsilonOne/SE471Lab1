package com.company;

public class LuxuryBus extends Bus{
    private final String type = "Luxury Bus";
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
