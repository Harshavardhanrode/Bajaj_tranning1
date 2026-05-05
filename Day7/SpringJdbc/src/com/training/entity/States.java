package com.training.entity;

public class States {
    private int stateCode;
    private  String stateName;
    private long statePopulation;
    private String capital;

    @Override
    public String toString() {
        return "States{" +
                "stateCode=" + stateCode +
                ", stateName='" + stateName + '\'' +
                ", statePopulation=" + statePopulation +
                ", capital='" + capital + '\'' +
                '}';
    }

    public States(int stateCode, String stateName, long statePopulation, String capital) {
        this.stateCode = stateCode;
        this.stateName = stateName;
        this.statePopulation = statePopulation;
        this.capital = capital;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public long getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(long statePopulation) {
        this.statePopulation = statePopulation;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public States() {
    }
}
