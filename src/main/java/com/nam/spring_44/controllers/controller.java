package com.nam.spring_44.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class controller {

    @RequestMapping({"/", "/index.html"})
    public String index(Locale locale, Model model){

        model.addAttribute("hello", "world");

        return "index";
    }

    @RequestMapping("/adduserform")
    public String adduserform(){
        return "adduserform";
    }

    @RequestMapping("/adduser")
    public String adduser(){
        return "adduser";
    }

    @RequestMapping("/adduser-success")
    public String adduser_success(){
        return "adduser-success";
    }

    @RequestMapping("/adduser-error")
    public String adduser_error(){
        return "adduser-error";
    }

    @RequestMapping("/viewusers")
    public String viewusers(){
        return "viewusers";
    }

    @RequestMapping("/editform")
    public String editform(){
        return "editform";
    }

    @RequestMapping("/edituser")
    public String edituser(){
        return "edituser";
    }

    @RequestMapping("/deleteuser")
    public String deleteuser(){
        return "deleteuser";
    }

}
