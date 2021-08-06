package com.Mvc.service;

import com.Mvc.API.User;

import java.util.List;

public interface LoginService {
    List<User> UserList();
    void AddUser(User user);
}
