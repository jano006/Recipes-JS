package org.example.recipesworking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MvcController {


    @GetMapping
    public String landingPage(){
        return "index";
    }

    @PostMapping("/sendBasket")
    public String sendBasket(){


        return "redirect:/";
    }
}
