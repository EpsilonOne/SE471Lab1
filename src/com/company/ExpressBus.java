package com.company;

public class ExpressBus extends Bus {
    private final String type = "Express Bus";
    private String company;



    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
