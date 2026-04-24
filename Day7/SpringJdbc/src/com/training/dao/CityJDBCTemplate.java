package com.training.dao;

import com.training.entity.City;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class CityJDBCTemplate implements CityDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        jdbcTemplateObject = new JdbcTemplate(ds);
    }

    @Override
    public void createCity(int cityCode, String cityName, int stateCode, long cityPopulaiton) {
        String sql = "insert into city (cityCode,cityName,stateCode,cityPopulation) values (?,?,?,?)";

        jdbcTemplateObject.update(sql, cityCode, cityName, stateCode, cityPopulaiton);
        System.out.println("Created Record CityCode = " + cityCode + " CityName = " + cityName + " StateCode = " + stateCode + " CityPopulation = " + cityPopulaiton);
    }

    @Override
    public void deleteCity(int cityCode) {
        String sql = "delete from city where cityCode = ?";
        jdbcTemplateObject.update(sql, cityCode);
        System.out.println("Deleted Record with CityCode = " + cityCode);
    }

    @Override
    public void changePopulation(int citycode,long newPopulation) {
        String sql = "update city set cityPopulation = ? where cityCode = ?";
        jdbcTemplateObject.update(sql, newPopulation, citycode);
        System.out.println("Updated Record with CityCode = " + citycode + " New Population = " + newPopulation);

    }
}
