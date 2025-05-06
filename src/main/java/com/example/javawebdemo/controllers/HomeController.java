package com.example.javawebdemo.controllers;

import com.example.javawebdemo.models.HockeyPlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController extends BaseController {

    @Autowired
    private HockeyPlayerRepo hockeyPlayerRepo;
    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("players", hockeyPlayerRepo.findAll());
        model.addAttribute("user", "Chandrika");

        return "home";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        String user=getLoggedInEmail();
        model.addAttribute("user", user);
        return "profile";
    }
}
