package com.bonds.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonds.app.model.UserModel;
import com.bonds.app.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/validuser")  
	private List<UserModel> getAllUser(){  
	return userService.getAllUser();  
	}  
	
	@GetMapping(path = "/validuser/{id}")  
	private UserModel getUser(@PathVariable("id") int id)   
	{  
	return userService.getUserById(id);  
	}  
	
	@DeleteMapping("/validuser/{id}")  
	private void deleteUser(@PathVariable("id") int id)   
	{  
	userService.delete(id);  
	}  
	@PostMapping("/validuser")  
	private int saveUser(@RequestBody UserModel userModel)   
	{  
	userService.saveOrUpdate(userModel);  
	return userModel.getId();
	}  


}
