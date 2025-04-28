package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		double sum = numbers.stream().mapToDouble(x->Math.pow(x, 2)).sum();
		int sums = (int)sum;
		System.out.println(sums);
		
		List<Integer> collect = numbers
		.stream()
		.filter(x->x%2==0)
		.map(x->(int)Math.pow(x, 2))
		.collect(Collectors.toList());
		System.out.println(collect);
		List<String> fruits = Arrays.asList("apple", "dog", "banana", "cat");
		List<String> collect2 = fruits.stream().filter(x->x.length()>=5).collect(Collectors.toList());
		System.out.println(collect2);
		List<String>wordList = Arrays.asList("hello world", "hello Java");
		List<String> collect3 = wordList.stream().flatMap(x->Arrays.stream(x.split("\\s+"))).distinct().collect(Collectors.toList());
		System.out.println(collect3);
		
		List<String>groupList = Arrays.asList("apple", "banana", "cherry", "avocado");
		
		Map<Character,List<String>> collect4 = groupList.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
		System.out.println(collect4);
		
		Integer reduce = numbers.stream().filter(x->x%2!=0).reduce(0,(a,b)->a+b);
		System.out.println(reduce);
				
		List<String> collect5 = groupList.stream().filter(x->x.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect5);
		long count = numbers.stream().filter(x->x%2==0).count();
		System.out.println(count);
	
		Map<Boolean,List<Integer>> collect6 = numbers.stream().collect(Collectors.partitioningBy(x->x%2==0));
		
		System.out.println(collect6);
		String s ="aabbc";
		Map<Character,Long> collect7 = s.chars()
		.mapToObj(x->(char)x)
		.collect(Collectors.toList())
		.stream()
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(collect7);
		
		List<String> collect8 = groupList.stream().filter(x->x.contains("a")).collect(Collectors.toList());
		System.out.println(collect8);
		
		List<Integer> collect9 = numbers
				.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(collect9);
		
		String join = String.join(",", groupList);
		System.out.println(join);
		
		
	}
}
