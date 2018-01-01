package com.et.service;

import com.et.entity.Food;
import com.et.util.PageTools;

public interface FoodService {

	public abstract PageTools queryFood(String foodame, Integer page, Integer rows);
	public void deleteFood(String foodid);
	public void updateFood(Food food);
	public void addFood(Food food);

}