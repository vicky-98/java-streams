package com.training.stream.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.training.stream.Fruit;

public class FruitTest {

	Fruit f1,f2,f3,f4,f5;
	
	@Before
	public void objinitial() {
		f1=new Fruit("mango", 120, 132, "yellow");
		f2=new Fruit("grapee", 100, 234, "violet");
		f3=new Fruit("orange", 234, 345, "orange");
		f4=new Fruit("watermeleon", 89, 123, "green");
		f5=new Fruit("apple", 89, 123, "green");
		
	}
	
	@Test
	public void testName() {
		List<String> expected= new ArrayList<String>();
		expected.add("orange");
		expected.add("mango");
		List<Fruit> actual=new ArrayList<Fruit>();
		actual.add(f1);
		actual.add(f2);
		actual.add(f3);
		actual.add(f4);
		
		assertEquals(expected, Fruit.sortbyCalorie(actual));
		
	}
	
	@Test
	public void testColor() {
		List<Fruit> expected= new ArrayList<Fruit>();
		expected.add(f1);
		
		List<Fruit> actual=new ArrayList<Fruit>();
		actual.add(f1);
		actual.add(f2);
		actual.add(f3);
		actual.add(f4);
		actual.add(f5);
		
		assertEquals(expected, Fruit.sortbyColor(actual, "yellow"));
		
	}
}
