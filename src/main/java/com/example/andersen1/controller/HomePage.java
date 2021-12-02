package com.example.andersen1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomePage {

    @GetMapping
    public String showPage(){
        return "index";
    }
}
