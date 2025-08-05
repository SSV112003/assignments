package com.example.demo.useraccount;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class AccountController {

    @GetMapping("/{id}/accounts")
    public String getAccounts(
            @PathVariable String id,
            @RequestParam String type,
            @RequestParam String status) {
        
        return "User ID: " + id + ", Type: " + type + ", Status: " + status;
    }
}
