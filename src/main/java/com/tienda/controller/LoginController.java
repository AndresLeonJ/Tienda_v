package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Andrés
 */

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String index() {
        return "/login";
    }
}
