package com.esocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping(value={"/","/user/signin"})
    public String index() {
        return "index";
    }
}
