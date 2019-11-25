package com.training.stream;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Trade {

	private String name, city;

	public Trade(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trade [name=" + name + ", city=" + city + "]";
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
	    Set<Object> seen = ConcurrentHashMap.newKeySet();
	    return t -> seen.add(keyExtractor.apply(t));
	}
	
	public static List<String> uniquecities(List<Trade> list){
		
		List<String> city=list.stream().filter(distinctByKey(Trade::getCity)).map(p->p.getCity()).collect(Collectors.toList());
		return city;
	}
	
	public static List<Trade> City(List<Trade> list, String str){
		List<Trade> trans=list.stream().filter(p->p.getCity().equals(str)).collect(Collectors.toList());
		return trans;
		
	}
	
	
	public static List<String> allnames(List<Trade> list){
		List<String> name=list.stream().map(p->p.getName()).sorted().collect(Collectors.toList());
		return name;
	}
}
