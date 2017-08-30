package com.FashionFootWear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Controller

public class HelloWorldController {
	
	String message = "Welcome to Spring MVC!";
	 
	 @RequestMapping("/helloworld")
	    public ModelAndView helloworld(){
	        ModelAndView modelandview=new ModelAndView("Register");
	        modelandview.addObject("message","Hi Surendra");
	        return modelandview;
	    }
	
	
	
    @RequestMapping("/Register")
    public ModelAndView Register(){
        ModelAndView modelandview=new ModelAndView("Register");
        modelandview.addObject("message","Hi Surendra");
        return modelandview;
    }
     
}
