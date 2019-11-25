package com.training.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fruit {

	private String name;
	private int calories;
	private int price;
	private String color;
	
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public static List<String> sortbyCalorie(List<Fruit> list){
		
		List<String> name=list.stream().filter((l)->l.getCalories()>100).sorted((l1,l2)->{return Integer.compare(l2.getCalories(),l1.getCalories());}).map((l)->l.getName()).collect(Collectors.toList());
		
		return name;
		
	}
public static List<Fruit> sortbyColor1(List<Fruit> list,String str){
		
		List<Fruit> color=list.stream().filter((l)->l.getColor().equals(str)).collect(Collectors.toList());
		
		return color;
		
	}
	
public static Map<String, String> sortbyColor(List<Fruit> list,String str){
		
		Map<String, String> color=list.stream().filter(l->l.getColor().matches(l.getColor())).collect(Collectors.toMap(Fruit::getColor, Fruit::getName));
		System.out.println(color);
		return color;
		
	}
}

