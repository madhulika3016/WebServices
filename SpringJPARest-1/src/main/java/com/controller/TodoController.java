package com.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.Todo;
import com.service.LoginService;
import com.service.TODOService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TODOService service;
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model){
		String name = (String) model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}
	
	
	  @RequestMapping(value="/add-todos", method = RequestMethod.GET) 
	  public String addTodos()
	  { 
		  service.addTodo("madhulika", "SPRING MVC", new Date(), true);
	  
	  return "list-todos"; 
	  }
	 
}

