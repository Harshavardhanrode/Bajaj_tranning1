package com.training.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class StateJDBCTemplate implements StateDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        jdbcTemplateObject = new JdbcTemplate(ds);
    }

    @Override
    public void createState(int stateCode, String stateName, long statePopulation, String capital) {
        String sql = "insert into state (state_code ,statename,state_population,capital)values (?,?,?,?)";
        jdbcTemplateObject.update(sql,stateCode,stateName,statePopulation,capital);
        System.out.println("Created Record StateCode = " + stateCode + " StateName = " + stateName + " StatePopulation = " + statePopulation + " Capital = " + capital);
    }

    @Override
    public void deleteState(int stateCode) {
        String sql = "delete from state where state_code = ?";
        jdbcTemplateObject.update(sql,stateCode);
        System.out.println("Deleted Record with StateCode = " + stateCode);
    }
}
