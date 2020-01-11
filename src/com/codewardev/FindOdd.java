package com.codewardev;

// https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

// alternatively we can use XOR
// // XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {

	public static int findIt(int[] a) {
		return Arrays.stream(a)
		.boxed()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream()
		.filter(x-> x.getValue()%2 != 0)
		.map(x->x.getKey())
		.findFirst()
		.orElse(-1);
	}

}
