package com.example.timedate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class TimeDate {

    @GetMapping("/hello")
    public String hello(Model model) {

        LocalDateTime nowDate = LocalDateTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒 E曜日");
        String formatNowDate = dtf2.format(nowDate);

        model.addAttribute("tag", "TimeDate, World!");
        model.addAttribute("timeDate", formatNowDate);

        return "index";
    }

}
