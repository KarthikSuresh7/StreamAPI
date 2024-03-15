package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {

	public static void main(String[] args) {
		int[]a = {1,4,5,2,11};
		List<String> collect = Arrays
				.stream(a)
				.boxed()
		.map(String::valueOf)
		.filter(x->x.startsWith("1"))
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
