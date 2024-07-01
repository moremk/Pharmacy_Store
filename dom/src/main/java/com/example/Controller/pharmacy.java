package com.example.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Entity.User;
import com.example.Service.tabservice;

@Controller
public class pharmacy {
	
 @Autowired
 private tabservice userService;
	
	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
	 
	@GetMapping("/addtable")
	public String addtable()
	{
		return "addtable";
	}
	 
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user)
	{	
		System.out.println(user);
		userService.save(user);
		return "redirect:/demo";
	}
	 @GetMapping("/demo")
     public String viewHomePage(Model model) 
	 {
         List<User> user = userService.findAll();
         model.addAttribute("user", user); 
         System.out.print("Get / "); 
         return "demo";
     }
	
	 
	@GetMapping("/contact")
	public String cont()
	{
		return "contact";
	}
	
	

}
