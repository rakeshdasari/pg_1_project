package com.pg.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.pg.domain.Category;
@Service
public class CategoryService {
	
	private static  List<Category> categories = new ArrayList<Category>(Arrays.asList(new Category ("dunkin",10.0,"This is no 1")));

	public List <Category> getAllCategories(){
		return categories;
		
	}

	public static  void addcategories(Category category) {
		categories.add(category);
			
	}

	public static Category getcategory(String categorytype) {
		// TODO Auto-generated method stub
		return getcategory(categorytype);
	}

	public static void updatecategories(String categorytype, Category category) {
		for (int i=0; i<categories.size();i++){
			 Category c =categories.get(i);
			if(c.getCategoryType().equals(categorytype)){
				//categories.set(c, category);
				return;
			}
		}
		
	}

	}

