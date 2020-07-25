package com.epam.java8;

public class PalindromeChecker {	
	public static boolean check(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
}