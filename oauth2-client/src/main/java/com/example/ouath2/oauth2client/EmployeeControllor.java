package com.example.ouath2.oauth2client;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeControllor {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView getEmployeeInfo() {
        return new ModelAndView("welcome.jsp");
    }
}