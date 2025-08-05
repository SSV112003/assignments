package com.example.demo.staticfiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticFilesController {

    @GetMapping("/")
    public String index() {
        return "index";  // loads templates/index.html
    }
}

