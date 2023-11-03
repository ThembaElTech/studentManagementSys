package com.example.studentManSys.Controller;

import com.example.studentManSys.Model.UserDtls;
//import com.example.studentManSys.Repo.UserRepository;
import com.example.studentManSys.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @ModelAttribute
    private void userDetails(ModelMap model, Principal principal) {

        String email = principal.getName();
        UserDtls user = userRepository.findByEmail(email);

        model.addAttribute("user", user);
    }
    @GetMapping("/")
    public String home() {
        return "user/home";
    }
}
