package com.Mvc.controllers;

import com.Mvc.API.User;
import com.Mvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/Login")
    public String ShowLogin (Model model){
        model.addAttribute("User",new User());
        return "LoginPanel";
    }

    @PostMapping("/LoginUser")
    public String loginUser(User user){
        String redirect = "";
        List<User> listOfUser = loginService.UserList();
        int count =0;
        for (User u : listOfUser){
            if(u.getLogin().equals(user.getLogin()) && u.getPass().equals(user.getPass())){
                count++;
            }
        }
        if(count>0){
            redirect = "redirect:/showEmployee";
        }else {
            redirect = "redirect:/ErrorLogin";
        }
        return redirect;
    }
}
