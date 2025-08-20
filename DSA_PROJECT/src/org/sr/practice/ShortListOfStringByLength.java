package org.sr.practice;

import java.util.List;



public class ShortListOfStringByLength {
public static void main(String[] args) {
	List<String> countries = List.of("India", "Japan", "USA", "Germany");
	System.out.println(get(countries));
}
static List<String> get(List<String>list){
	return list.stream().sorted().toList();
}
}
