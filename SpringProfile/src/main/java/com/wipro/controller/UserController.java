package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String loginPage() {

        return "Login";
    }

    @RequestMapping("/signup")
    public String signupPage() {

        return "Signup";
    }

    @RequestMapping("/profile")
    public ModelAndView profilePage() {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("Profile");

        mv.addObject("username", "Rahul Sharma");

        mv.addObject(
                "imageurl",
                "https://i.pravatar.cc/200"
        );

        mv.addObject(
                "designation",
                "Java Full Stack Developer"
        );

        return mv;
    }
}