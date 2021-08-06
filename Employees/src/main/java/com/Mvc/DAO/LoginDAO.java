package com.Mvc.DAO;

import com.Mvc.API.User;

import java.util.List;


public interface LoginDAO {
    List<User> loadUser();
    void AddUser(User user);
}
