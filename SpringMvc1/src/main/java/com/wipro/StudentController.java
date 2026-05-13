package com.wipro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @GetMapping("/")
    public String showForm() {

        return "First";
    }

    @PostMapping("/addStudent")
    public ModelAndView submitForm(Student student) {

        ModelAndView mv = new ModelAndView();

        mv.addObject("student", student);

        String name = student.getName();
        String email = student.getEmail();

        // Validation

        if(name.matches("[a-zA-Z ]{3,}") &&
           email.matches("^[A-Za-z0-9+_.-]+@(.+).com$")) {

            mv.setViewName("Success");

        }
        else {

            mv.addObject("msg",
            "Invalid Name or Email");

            mv.setViewName("Error");
        }

        return mv;
    }
}