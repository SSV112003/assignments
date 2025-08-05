package com.example.demo.redirection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/example/test")
    public String redirectToTest2() {
        // Redirect to another endpoint
        return "redirect:/example/test2";
    }

    @GetMapping("/example/test2")
    public String test2Page() {
        return "test2";  // This should map to test2.html in templates folder
    }
}

