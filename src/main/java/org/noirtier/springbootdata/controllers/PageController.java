package org.noirtier.springbootdata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/main")
    public String mainPage(){
        return "main";
    }
}
