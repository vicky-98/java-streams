package com.training.stream.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.training.stream.Trade;

public class TradeTest {

	Trade ta1,ta2,ta3,ta4,ta5;
	
	@Before
	public void objinitial() {
		ta1=new Trade("vicky", "coimbatore");
		ta2=new Trade("vicky", "coimbatore");
		ta3=new Trade("ajay", "erode");
		ta4=new Trade("arun", "pune");
		ta5=new Trade("akash", "pune");
	}
	
	@Test
	public void testUniquecities() {
	
		List<Trade> actual=new ArrayList<Trade>();
		actual.add(ta1);
		actual.add(ta2);
		actual.add(ta3);
		
	
		
		List<String> expected= new ArrayList<String>();
		expected.add("coimbatore");
		expected.add("erode");
		
		assertEquals(expected, Trade.uniquecities(actual));
		
	}
	
	@Test
	public void testcity() {
		List<Trade> actual=new ArrayList<Trade>();
		actual.add(ta1);
		actual.add(ta2);
		actual.add(ta3);
		actual.add(ta4);
		actual.add(ta5);
		
		
		List<Trade> expected= new ArrayList<Trade>();
		expected.add(ta4);
		expected.add(ta5);
		
		assertEquals(expected,Trade.City(actual, "pune") );
	}
	
	@Test
	public void testallnames() {
	
		List<Trade> actual=new ArrayList<Trade>();
		actual.add(ta1);
		actual.add(ta4);
		actual.add(ta3);
		
	
		
		List<String> expected= new ArrayList<String>();
		expected.add("ajay");
		expected.add("arun");
		expected.add("vicky");
		
		assertEquals(expected, Trade.allnames(actual));
		
	}
}
