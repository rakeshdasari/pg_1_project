package com.pg.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pg.domain.Category;

@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryservice;
	@RequestMapping("/categories")
	public List<Category> getAllCategories(){
		return categoryservice.getAllCategories();
	}
	@RequestMapping("/categories/{categorytype}")
	public Category getCategory(@PathVariable String categorytype){
		return CategoryService.getcategory(categorytype);
		
	}
     @RequestMapping(value="/categories", method=RequestMethod.POST)
    public void addCategory(@RequestBody Category category) {
    	CategoryService.addcategories(category);
    	}
     @RequestMapping(value="/categories/{categorytype}", method=RequestMethod.PUT)
     public void updateCategory(@RequestBody Category category,@PathVariable String categorytype) {
     	CategoryService.updatecategories(categorytype,category);
     	}
     
     
}
