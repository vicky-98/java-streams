package com.training.stream.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import org.junit.Before;
import org.junit.Test;

import com.training.stream.Transaction;

public class TransactionTest {
	
	Transaction t1,t2,t3,t4;
	
	@Before
	public void objinitial() {
		t1=new Transaction("vicky", "coimbatore", 2011, 120000);
		t2=new Transaction("Ajay", "Salem", 2010, 21300);
		t3=new Transaction("vino", "erode", 2013, 89000);
		t4=new Transaction("ram", "coimbatore", 2011, 1200);
	}
	
	@Test
	public void testyear() {
		List<Transaction> expected=new ArrayList<Transaction>();
		expected.add(t4);
		expected.add(t1);
		
		List<Transaction> actual=new ArrayList<Transaction>();
		actual.add(t1);
		actual.add(t2);
		actual.add(t3);
		actual.add(t4);
		
		assertEquals(expected, Transaction.year(actual));
		
	}

	@Test
	public void testcity() {
		List<String> expected=new ArrayList<String>();
		expected.add("ram");
		expected.add("vicky");
		
		List<Transaction> actual=new ArrayList<Transaction>();
		actual.add(t1);
		actual.add(t2);
		actual.add(t3);
		actual.add(t4);
		
		assertEquals(expected, Transaction.Cityandname(actual, "coimbatore"));
		
	}
	
	@Test
	public void testmax() {
		
		
		List<Transaction> actual=new ArrayList<Transaction>();
		actual.add(t1);
		actual.add(t2);
		actual.add(t3);
		actual.add(t4);
		
		OptionalInt a=OptionalInt.of(120000);
		
		assertEquals(a, Transaction.maxvalue(actual));
		
	}
	
	@Test
	public void testmin() {
		
		
		List<Transaction> actual=new ArrayList<Transaction>();
		actual.add(t1);
		actual.add(t2);
		actual.add(t3);
		actual.add(t4);
		
		OptionalInt a=OptionalInt.of(1200);
		
		assertEquals(a, Transaction.minvalue(actual));
		
	}
}
