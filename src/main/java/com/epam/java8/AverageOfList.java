package com.epam.java8;

import java.util.*;

public class AverageOfList {
	
	public static double Average(List<Integer> list)
	{
		int [] array = list.stream().mapToInt(Integer::intValue).toArray();
		return Arrays.stream(array).mapToDouble(ele -> (double)ele).average().getAsDouble();
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			List<Integer> list = new ArrayList<Integer>();
			System.out.println("To Add Element to List Press : y");
			String option = sc.next();
			while("y".equalsIgnoreCase(option.trim()))
			{
				int number = sc.nextInt();
				list.add(number);
				System.out.println("To Add Element to List Press : y");
				option = sc.next();
			}
			System.out.println("Average of the list is : "+Average(list));
			
		}
		
	}

}
