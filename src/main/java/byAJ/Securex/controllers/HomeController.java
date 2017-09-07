package byAJ.Securex.controllers;

import byAJ.Securex.models.UserSec;
import byAJ.Securex.repositories.RoleSecRepository;
import byAJ.Securex.repositories.UserSecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    RoleSecRepository roleRepo;

    @Autowired
    UserSecRepository userRepo;

    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/signup")
    public String signup(Model model)
    {
        model.addAttribute("newuser", new UserSec());
        return "signup";
    }

    @PostMapping("/signup")
    public String signedup(@ModelAttribute("newuser") UserSec user)
    {
        user.addRole(roleRepo.findByRole("USER")); //addRole is equivalent to my addToCollection()
        userRepo.save(user);
        return "login";
    }

}
