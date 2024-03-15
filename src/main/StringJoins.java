package main;

import java.util.Arrays;
import java.util.List;

public class StringJoins {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("1","2","3");
		
		String join = String.join("-", asList);
		
		System.out.println(join);
	}
}
