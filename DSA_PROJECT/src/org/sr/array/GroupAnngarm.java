package org.sr.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnngarm {
public static void main(String[] args) {
	String [] arr ={"eat"};
	System.out.println(get(arr));
}

static List<List<String>> get(String [] arr){
	Map<String, List<String>> list= new HashMap<>();
	for(String str:arr) {
		char [] charArray= str.toCharArray();
		Arrays.sort(charArray);
		String key= new String(charArray);
		list.computeIfAbsent(key, k->new ArrayList<String>()).add(str);
		
	}
	return new ArrayList<>(list.values());
}
}
