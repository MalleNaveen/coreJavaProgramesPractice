package com.lamdastreams;

import java.util.Arrays;
import java.util.List;

public class GroupByusingStream {
	public static void main(String args[]){
		
		Employee john = new Employee("E123", "John Nhoj", 200.99, "IT");
		Employee south = new Employee("E223", "South Htuos", 299.99, "Sales");
		Employee reet = new Employee("E133", "Reet Teer", 300.99, "IT");
		Employee prateema = new Employee("E143", "Prateema Rai", 300.99, "Benefits");
		Employee yogen = new Employee("E323", "Yogen Rai", 200.99, "Sales");

		List<Employee> employees = Arrays.asList(john, south, reet, prateema, yogen);
		//finding average
		//Double averageSalary = employees.stream().collect(averagingDouble(Employee::getSalary));
		// 260.79
		//total
		/*Double totalSalary = employees.stream().collect(summingDouble(Employee::getSalary));
		// 1303.95
		
		Double maxSalary = employees.stream().collect(collectingAndThen(maxBy(comparingDouble(Employee::getSalary)), emp -> emp.get().getSalary()));
		// 300.99
		
		Collector<T,A,RR> collectingAndThen(Collector<T,A,R> downstream, Function<R,RR> finisher)
		
		String avgSalary = employees.stream()
        .collect(collectingAndThen(averagingDouble(Employee::getSalary), new DecimalFormat("'$'0.000")::format));
// $260.790
		
		DoubleSummaryStatistics statistics = employees.stream().collect(summarizingDouble(Employee::getSalary));
		System.out.println("Average: " + statistics.getAverage() + ", Total: " + statistics.getSum() + ", Max: " + statistics.getMax() + ", Min: "+ statistics.getMin());
		// Average: 260.79, Total: 1303.95, Max: 300.99, Min: 200.99 
		
		List<String> employeeNames = employees.stream().collect(mapping(Employee::getName, toList()));
		// [John Nhoj, South Htuos, Reet Teer, Prateema Rai, Yogen Rai]
		
		String employeeNamesStr = employees.stream().map(Employee::getName).collect(joining(","));
		// John Nhoj,South Htuos,Reet Teer,Prateema Rai,Yogen Rai
		
		Collector<CharSequence,?,String> joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
		
		String employeeNamesStr = employees.stream().map(Employee::getName).collect(joining(", ", "Employees = {", "}"));
		// Employees = {John Nhoj, South Htuos, Reet Teer, Prateema Rai, Yogen Rai}
		
		Collector<T,?,Map<K,List<T>>> groupingBy(Function<? super T,? extends K> classifier)
				
				Map<String, List<Employee>> deptEmps = employees.stream().collect(groupingBy(Employee::getDepartment)); 

		// {Sales=[{empId='E223', name='South Htuos', salary=299.99, department='Sales'}, {empId='E323', name='Yogen 
		
		Map<String, Long> deptEmpsCount = employees.stream().collect(groupingBy(Employee::getDepartment, counting()));
		// {Sales=2, Benefits=1, IT=2}
		
		Map<String, Double> averageSalaryDeptSorted = employees.stream().collect(groupingBy(Employee::getDepartment, TreeMap::new, averagingDouble(Employee::getSalary)));
		// {Benefits=300.99, IT=250.99, Sales=250.49}
		
		Map<String, Long> deptEmpCount = employees.stream().collect(groupingByConcurrent(Employee::getDepartment, counting())); 
		// {Sales=2, IT=2, Benefits=1}
		Collector<T,?,Map<Boolean,List<T>>> partitioningBy(Predicate<? super T> predicate
				Map<Boolean, List<Employee>> portionedEmployees = employees.stream().collect(partitioningBy(e -> e.getSalary() > averageSalary));
		// {false=[{empId='E123', name='John Nhoj', salary=200.99, department='IT'}, {empId='E323', name='Yogen Rai', salary=200.99, department='Sales'}], 
		true=[{empId='E223', name='South Htuos', salary=299.99, department='Sales'}, {empId='E133', name='Reet Teer', salary=300.99, department='IT'}, {empId='E143', name='Prateema Rai', salary=300.99, department='Benefits'}]}
	
	Collector<T,?,Map<Boolean,D>> partitioningBy(Predicate<? super T> predicate, Collector<? super T,A,D> downstream)
			
			*/
	}

}
