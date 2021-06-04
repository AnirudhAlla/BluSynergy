package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	
	@RequestMapping(value = "/home" , method=RequestMethod.GET)
	public String ModelAndView (@RequestParam("name") String name)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("name");
		mv.setViewName("Home");
		return "Home";
		
		}
	
	@RequestMapping(value="/cart", method=RequestMethod.GET)
	String cart(@ModelAttribute("userDetails")) {
		@SessionAttribute(name="name",email="email",products="products")
		List<Orders> total=Productservice.fetchAll();
		if(total!=null) {
			model.addAttribute("products",products);
			model.addAttributes("users",user);
		}
		return "final";
	}

