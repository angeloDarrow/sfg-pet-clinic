package com.angelo.sfgpetclinic.controllers;

import com.angelo.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"","index"})
    public String listVets(Model model){

        model.addAttribute("owners", ownerService.findaAll());

        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners(){
        return "notimplemented";
    }
}
