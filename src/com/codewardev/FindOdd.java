package com.codewardev;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {

	public static int findIt(int[] a) {
		int oddNum = Arrays.stream(a)
		.boxed()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream()
		.filter(x-> x.getValue()%2 != 0)
		.map(x->x.getKey())
		.findFirst()
		.orElse(-1);
		return oddNum;
	}

}