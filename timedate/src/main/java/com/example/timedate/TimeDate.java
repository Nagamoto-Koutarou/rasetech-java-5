package com.example.timedate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TimeDate {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("tag", "Hello, World!");
        return "index";
    }

}
