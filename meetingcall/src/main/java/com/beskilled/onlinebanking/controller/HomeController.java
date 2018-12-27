package com.beskilled.onlinebanking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String displayHome(){
        return "index";
    }
    @GetMapping(value = "/roll-add.jsf")
    public String displayAddRol(){
        return "add-roll";
    }





}
