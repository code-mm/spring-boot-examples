package com.example.demo.jdbc;

import com.google.gson.Gson;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.nio.IntBuffer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
public class JDBCExample {
    @Resource
    private JdbcTemplate jdbcTemplate;


    @ResponseBody
    @RequestMapping("/users")
    public String getUsers() {
        String sql = "select * from user";
        List<User> query = jdbcTemplate.query(sql, new RowMapper<User>() {
            User user;

            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                int sex = resultSet.getInt("sex");
                System.out.println(String.format("name : %s age : %d sex : %d", name, age
                        , sex));
                user = new User(name, age, sex);
                return user;
            }
        });
        return new Gson().toJson(query).toString();
    }
}