package com.example.colorpicker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorController {

    private String color = "#ffffff";  // default color

    @GetMapping("/")
    public String getColorPicker(Model model) {
        model.addAttribute("color", color);
        return "colorpicker";
    }

    @PostMapping("/changeColor")
    public String changeColor(@RequestParam("color") String newColor, Model model) {
        color = newColor;
        model.addAttribute("color", color);
        return "colorpicker";
    }
}

