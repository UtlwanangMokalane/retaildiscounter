package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import bean.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/index")
    public String viewForm(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/index")
    public String processForm(@ModelAttribute User user, BindingResult result, Model model){
        model.addAttribute("user", new User());
        return "index";
    }
}
