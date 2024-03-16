package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortingInMap {

	public static void main(String[] args) {
		Map<String,Integer> maps =  new HashMap<>();
		maps.put("Eight",8);
		maps.put("thirty", 30);
		maps.put("Nine", 9);
		maps.put("Ten", 10);
		maps.put("Twenty", 20);
		System.out.println(maps);
		
		List<String> collect = maps.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
	}
}
