package com.angelo.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping({"","/","index","index.html"})
    public String index(){

        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHndler(){
        return "notimplemented";
    }
}
