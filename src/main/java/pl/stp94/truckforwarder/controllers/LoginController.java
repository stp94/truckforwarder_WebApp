package pl.stp94.truckforwarder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    private String appMode;

    @Autowired
    public LoginController(Environment environment){
        appMode = environment.getProperty("app-mode");
    }


    @GetMapping("/")
    public String loginPage(Model model) {
        model.addAttribute("mode", appMode);
        return "login";
    }
}
