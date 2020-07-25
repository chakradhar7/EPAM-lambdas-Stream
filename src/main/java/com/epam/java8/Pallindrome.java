package com.epam.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Pallindrome {
	
	private static List<String> filterPalindrome(List<String> list, Predicate<String> myPredicate) {
		return list.stream().filter(str -> myPredicate.test(str)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
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
			
			filterPalindrome(list,PalindromeChecker::check).forEach(System.out::println);
		}

	}

}
