package com.company;

public class ExpressBus extends Bus {
    private final String type = "Express Bus";
    private String company;
    private String start;
    private  String end;


    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
