package org.launchcode.WeatherCheck.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomepage(Model model){
        ArrayList<String> weatherReport = new ArrayList<>();
        weatherReport.add("Cloudy");
        weatherReport.add("Sunny");
        weatherReport.add("Rainy");
        model.addAttribute("weather", weatherReport);
        return "index";
    }

    @PostMapping("add")
    @ResponseBody
    public String respondBack(){
        return "You're Here!";
    }



}
