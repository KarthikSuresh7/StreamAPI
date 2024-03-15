package main;

import java.util.Arrays;


public class LongLengthInArray {

	public static void main(String[] args) {
		String []a= {"java","pyhton","html"};
		
		String longestLengthInArray = Arrays
				.stream(a)
				.reduce((x,y)->x.length()>y.length()?x:y).get();
		System.out.println(longestLengthInArray);
		
	}
}
