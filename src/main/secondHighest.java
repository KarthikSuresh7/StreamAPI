package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class secondHighest {

	public static void main(String[] args) {
		int[]a = {1,4,5,2};
		Integer secondHighestNumber = Arrays.stream(a).boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println(secondHighestNumber);
		
	}
}
