package com.Mvc.controllers;

import com.Mvc.API.User;
import com.Mvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;


@Controller
public class RegisterController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/Register")
    public String errorRegister(Model model){
        model.addAttribute("user",new User());
        return "RegisterPanel";
    }

    @PostMapping("/Register")
    public String RegisterPanel(Model model){
        model.addAttribute("user",new User());
        return "RegisterPanel";
    }

    @PostMapping("/RegisterUser")
    public String ShowRegisterPanel(User user, RedirectAttributes redirectAttributes){
        List<User> uList = loginService.UserList();
        int counter = 0;
        String redict = "";
        for(User us :uList){
            if(us.getLogin().equals(user.getLogin()) || us.getEmail().equals(user.getEmail())){
                counter ++;
            }
        }
        if(counter>0){
            redict = "redirect:/ErrorRegister";
        }else {
            loginService.AddUser(user);
            redict = "redirect:/Login";
        }
        return redict;
    }


}
