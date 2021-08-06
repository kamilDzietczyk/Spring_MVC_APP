package com.Mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/ErrorRegister")
    public String errorRegister(){
        return "RegisterError";
    }

    @GetMapping("/ErrorLogin")
    public String errorLogin(){
        return "LoginError";
    }

    @GetMapping("/ErrorAddUser")
    public String errorAddUser(){
        return "ErrorAddEmploye";
    }

}
