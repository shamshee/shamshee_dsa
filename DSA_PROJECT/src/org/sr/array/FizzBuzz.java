package org.sr.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
	public static void main(String[] args) {
//System.out.println(getList(15));
 System.out.println(Arrays.toString(getWithDiv(15)));
	}

	static List<String> getList(int n) {
		List<String> list = new ArrayList<>(n);
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}

	static String [] get(int n) {
		String [] arr= new String[n];
		for(int i=1;i<=n;i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				arr[i-1]="FizzBuzz";
			} else if (i % 3 == 0) {
				arr[i-1]="Fizz";
			} else if (i % 5 == 0) {
				arr[i-1]="Buzz";
			} else {
				arr[i-1]=String.valueOf(i);
			}
		}
		return arr;
		
	}
	
	static String [] getWithDiv(int n) {
		String [] arr= new String[n];
		
		for(int i=1;i<=n;i++) {
			boolean div3=i % 3 == 0;
			boolean div5=i % 5 == 0;
			
			if (div3 && div5 ) {
				arr[i-1]="FizzBuzz";
			} else if (div3) {
				arr[i-1]="Fizz";
			} else if (div5) {
				arr[i-1]="Buzz";
			} else {
				arr[i-1]=String.valueOf(i);
			}
		}
		return arr;
		
	}
	
}
