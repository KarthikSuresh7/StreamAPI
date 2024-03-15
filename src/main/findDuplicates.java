package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDuplicates {
	public static void main(String[] args) {
		String s ="iloveIndia";
		//dupicate elements in the string
		List<String> collect = Arrays
				.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
