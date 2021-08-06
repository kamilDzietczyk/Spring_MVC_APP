package com.Mvc.rowmapper;

import com.Mvc.API.Employee;
import com.Mvc.API.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRowmapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setLogin(rs.getString("Login"));
        user.setPass(rs.getString("Password"));
        user.setEmail(rs.getString("Email"));
        return user;
    }
}
