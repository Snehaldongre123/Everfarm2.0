package com.Everfarm.Everfarm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class pageController {
    @RequestMapping("/home")
    public String home(Model model)
    {
        System.out.println("Home page handler");

        //Sending data to view
        model.addAttribute("name", "Subspring Technologies");
        model.addAttribute("EverFarmProject", "Created by Snehal");
        model.addAttribute("GithubRepository", "https://github.com/search?q=repository%20page&type=repositories");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("About page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("services page loading");
        return "services";
    }
    
}
