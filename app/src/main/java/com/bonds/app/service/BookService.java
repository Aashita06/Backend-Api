package com.bonds.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonds.app.model.*;
import com.bonds.app.repository.*;

@Service
public class BookService {
	
 
	@Autowired  
	BookRepository bookRepository;  
	//getting all student records  
	public List<BookModel> getAllBook()   
	{  
	List<BookModel> books = new ArrayList<BookModel>();  
	bookRepository.findAll().forEach(books::add);  
	return books;  
	}  
	//getting a specific record  
	public BookModel getBookById(int id)   
	{  
	return bookRepository.findById(id).get();  
	} 
	
	public void saveOrUpdate(BookModel bookModel)   
	{  
	bookRepository.save(bookModel);  
	}  
	//deleting a specific record  
	public void delete(int id)   
	{  
	bookRepository.deleteById(id);  
	}  
	 
	}  

