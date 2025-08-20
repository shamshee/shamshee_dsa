package org.sr.array;

public class CommonPrefix {
public static void main(String[] args) {
	 String[] words1 = {"flower", "flow", "floght"};
     String[] words2 = {"dog", "racecar", "car"};
     System.out.println(get(words2));
}

static String get(String [] arr) {
	if( arr==null || arr.length==0)return "";
	
	
	String prefix= arr[0];
	
	for(int i=1;i<arr.length;i++) {
		while(arr[i].indexOf(prefix)!=0) {
			prefix= prefix.substring(0,prefix.length()-1);
			if(prefix.isEmpty()) {
				return "";
			}
		}
	}
	return prefix;
}
}
