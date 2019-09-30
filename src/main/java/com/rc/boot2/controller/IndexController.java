package com.rc.boot2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    @GetMapping(value = {"/", "/index"})
    public String hello(Model model){
        model.addAttribute("host", "www.rc.com");
        return "index";
    }

    @GetMapping(value = {"/layout"})
    public String layout(Model model){
        return "layout/layout";
    }
}
