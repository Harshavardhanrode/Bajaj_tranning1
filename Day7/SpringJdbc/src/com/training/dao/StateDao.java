package com.training.dao;

import com.training.entity.States;

import javax.sql.DataSource;

public interface StateDao {
    public void setDataSource(DataSource ds);
    public void createState(int stateCode,String stateName,long statePopulation,String capital);
    public void deleteState(int stateCode);
    public States searchState(int StateCode);
}
