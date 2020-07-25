package com.epam.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringStartingWithA {
	
	private static List<String> filterPrefix(List<String> list) {
		return list.stream().filter(s -> s.length()==3 && s.charAt(0)=='a').collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
					List<String> list = new ArrayList<String>();
					System.out.println("To Add Element to List Press : y");
					String option = sc.next();
					while("y".equalsIgnoreCase(option.trim()))
					{
						String str = sc.next();
						list.add(str);
						System.out.println("To Add Element to List Press : y");
						option = sc.next();
					}
					
					filterPrefix(list).forEach(System.out::println);
				}

	}

}
