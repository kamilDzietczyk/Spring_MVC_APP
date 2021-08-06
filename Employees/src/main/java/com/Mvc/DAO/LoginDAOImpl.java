package com.Mvc.DAO;

import com.Mvc.API.User;
import com.Mvc.rowmapper.LoginRowmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoginDAOImpl implements LoginDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<User> loadUser() {
        String sql = "SELECT * FROM user;";
        List<User> userList = jdbcTemplate.query(sql,new LoginRowmapper());
        return userList;
    }

    @Override
    public void AddUser(User user) {
        Object[] PqramSQL = {user.getLogin(),user.getPass(),user.getEmail()};
        String sql = "INSERT INTO user (`Login`, `Password`, `Email`) VALUES (?, ?,?);";
        jdbcTemplate.update(sql,PqramSQL);
    }
}
