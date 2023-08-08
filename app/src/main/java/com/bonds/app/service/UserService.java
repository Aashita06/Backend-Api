package com.bonds.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonds.app.model.*;
import com.bonds.app.repository.*;

@Service
public class UserService {
	@Autowired  
	UserRepository userRepository;  
	//getting all student records  
	public List<UserModel> getAllUser()   
	{  
	List<UserModel> users = new ArrayList<UserModel>();  
	userRepository.findAll().forEach(users::add);  
	return users;  
	}  
	//getting a specific record  
	public UserModel getUserById(int id)   
	{  
	return userRepository.findById(id).get();  
	} 
	
	public void saveOrUpdate(UserModel userModel)   
	{  
	userRepository.save(userModel);  
	}  
	//deleting a specific record  
	public void delete(int id)   
	{  
	userRepository.deleteById(id);  
	}  
	 
	
}
