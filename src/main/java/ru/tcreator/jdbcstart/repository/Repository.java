package ru.tcreator.jdbcstart.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class Repository {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Autowired
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<?> getSomething(String query) {
        List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
        return list;
    }
}