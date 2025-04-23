package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller  // Make this class a controller for Thymeleaf templates
public class DevopsApplication {

    // This method handles the /hello endpoint
    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, World!");  // Passing data to the template
        return "hello";  // Return the hello.html template
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsApplication.class, args);
    }
}
