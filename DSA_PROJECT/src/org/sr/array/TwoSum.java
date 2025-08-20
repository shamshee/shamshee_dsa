package org.sr.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
public static void main(String[] args) {
	
	System.out.println(37%10);
	int [] nums= {3,3};
	System.out.println(Arrays.toString(twoSum(nums, 6)));
}
	
public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap=new HashMap();
        for(  int i=0 ;i<nums.length;i++) {
        	int remaining= target-nums[i];
        	if(indexMap.containsKey(remaining)) {
        		return new int[]{indexMap.get(remaining),i };
        	}
        	indexMap.put(nums[i], i);
        	
        }
		return new int[] {};
        
    }
}
