package ru.tcreator.jdbcstart.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @Autowired
    public JdbcTemplate jdbcTemplate;

//    @Autowired
//    public DataSource dataSource;

    @Autowired
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void getSomething(String query) {
        List<?> list = jdbcTemplate.queryForList("select * from customers");
    }
}