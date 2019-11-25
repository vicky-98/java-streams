package com.training.stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Transaction extends Trade {
	
	private int year,value;

	

	public Transaction(String name, String city, int year, int value) {
		super(name, city);
		this.year = year;
		this.value = value;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	@Override
	public String toString() {
		return (super.toString() +", year=" + year + ", value=" + value);
	}
	
	public static List<Transaction> year(List<Transaction> list){
		List<Transaction> year=list.stream().filter(l->l.getYear()==2011).sorted((l1,l2)->{return Integer.compare(l1.getValue(), l2.getValue());}).collect(Collectors.toList());
		
		return year;
	}
	

	public static List<String> Cityandname(List<Transaction> list, String str){
		List<String> name=list.stream().filter(p->p.getCity().equals(str)).map(p->p.getName()).sorted().collect(Collectors.toList());
		return name;
		
	}

	
	public static OptionalInt maxvalue(List<Transaction> list){
		OptionalInt max=list.stream().mapToInt(l->l.getValue()).max();
		return max;
	}

	
	public static OptionalInt minvalue(List<Transaction> list){
		OptionalInt min=list.stream().mapToInt(l->l.getValue()).min();
		return min;
	}
}
