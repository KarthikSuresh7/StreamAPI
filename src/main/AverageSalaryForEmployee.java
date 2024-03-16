package main;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageSalaryForEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee (101, "Brein", "Female",20000.0));
		employeeList.add(new Employee (102, "Paul",  "Male",10000.0));
		
		
		employeeList.stream().forEach(System.out::println);
		
		System.out.println("-------------------");
		
		Double reduce = employeeList
				.stream()
				.map(Employee::getSalary)
				.reduce(0.0, Double::sum);
		
	int size = employeeList.size();
	
	double average = reduce/(double)size;
	
	System.out.println(average);
		
		
	double asDouble = employeeList
	.stream()
	.mapToDouble(Employee::getSalary).average().getAsDouble();
	
	System.out.println(asDouble);
	
		
		
	}
}
