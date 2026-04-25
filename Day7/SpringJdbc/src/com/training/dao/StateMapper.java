package com.training.dao;

import com.training.entity.States;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StateMapper implements RowMapper<States> {
    @Override
    public com.training.entity.States mapRow(ResultSet rs, int rowNum) throws SQLException {
        States state = new States();
        state.setStateCode(rs.getInt("state_code"));
        state.setStateName(rs.getString("statename"));
        state.setStatePopulation(rs.getLong("state_population"));
        state.setCapital(rs.getString("capital"));
        return state;
    }
}
