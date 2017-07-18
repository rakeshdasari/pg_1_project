package com.pg.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pg.domain.Category;

@RestController
public class CategoryController {
	//http://localhost:8080/getAllCategories
	@RequestMapping("/getAllCategories")
	public List<Category> getCategories(){
		List<Category> categoriesList = new ArrayList<Category>();
		Category category = new Category();
		category.setCategoryType("Tupe1");
		category.setDescription("This is category 1");
		category.setPrice(100.25);
		categoriesList.add(category);
		return categoriesList;
	}

}
