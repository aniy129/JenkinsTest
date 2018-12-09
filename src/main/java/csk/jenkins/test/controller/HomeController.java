package csk.jenkins.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("val","hello ,this is my home page");
        return "index";
    }
}
