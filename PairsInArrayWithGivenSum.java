package Automation.test;

import java.util.*;

public class PairsInArrayWithGivenSum {
	
	
	private static void pairs(int[] arr,int sum) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i:arr) {
			int diff = sum-i;
			if(map.containsKey(diff)) {
				System.out.println(diff+" "+i);
			}else {
				map.put(i,0);
			}
		}
		
	}

	

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5,6};
		pairs(arr,6);
	}

	
}
