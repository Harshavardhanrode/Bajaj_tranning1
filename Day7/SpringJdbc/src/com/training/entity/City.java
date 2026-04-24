package com.training.entity;

public class City {
    private int citycode;
    private String cityname;
    private int stateCode;
    private long cityPopulation;

    public City() {
    }

    public City(int citycode, String cityname, int stateCode, long cityPopulation) {
        this.citycode = citycode;
        this.cityname = cityname;
        this.stateCode = stateCode;
        this.cityPopulation = cityPopulation;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public long getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(long cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
}