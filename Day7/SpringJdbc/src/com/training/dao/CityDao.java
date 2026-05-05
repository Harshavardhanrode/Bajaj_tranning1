package com.training.dao;

import com.training.entity.City;

import javax.sql.DataSource;

public interface CityDao {
    public void setDataSource(DataSource ds);
    public void createCity(int cityCode,String cityName,int stateCode,long cityPopulaiton);
    public void deleteCity(int cityCode);
    public void changePopulation(int citycode,long newPopulation);

}
