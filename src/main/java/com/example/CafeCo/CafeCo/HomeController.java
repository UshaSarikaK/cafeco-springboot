package com.example.CafeCo.CafeCo;

import com.example.CafeCo.CafeCo.model.Cafe;
import com.example.CafeCo.CafeCo.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CafeService cafeService;

    @GetMapping("/")
    public String home(Model model) {
        List<Cafe> cafes = cafeService.getAllCafes();
        model.addAttribute("cafes", cafes);
        return "home"; // This will look for home.html inside templates/
    }

    @GetMapping("/perform")
    public String form() {
        return "perform_form"; // This will look for perform_form.html inside templates/
    }
}
