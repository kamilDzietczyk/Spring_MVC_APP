package com.Mvc.service;
import com.Mvc.API.User;
import com.Mvc.DAO.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDAO loginDAO;

    @Override
    public List<User> UserList() {
        List<User> UserList = loginDAO.loadUser();
        return UserList;
    }

    @Override
    public void AddUser(User user) {
        loginDAO.AddUser(user);
    }
}
