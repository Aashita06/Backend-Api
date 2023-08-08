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

import com.bonds.app.model.BookModel;
import com.bonds.app.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(path = "/book")  
	private List<BookModel> getAllBook(){  
	return bookService.getAllBook();  
	}  
	
	@GetMapping(path = "/book/{id}")  
	private BookModel getBook(@PathVariable("id") int id)   
	{  
	return bookService.getBookById(id);  
	}  
	
	@DeleteMapping("/book/{id}")  
	private void deleteBook(@PathVariable("id") int id)   
	{  
	bookService.delete(id);  
	}  
	@PostMapping("/book")  
	private int saveBook(@RequestBody BookModel bookModel)   
	{  
	bookService.saveOrUpdate(bookModel);  
	return bookModel.getId();
	}  

}


