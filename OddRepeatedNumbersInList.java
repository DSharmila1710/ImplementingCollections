package Automation.test;
import java.util.*;

public class OddRepeatedNumbersInList {

	private static List<Integer> removeOddIterationsOfNumbers(List<Integer> list){
		List<Integer> result = new ArrayList<Integer>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i:list) {
			int count=map.containsKey(i)?map.get(i):0;
			map.put(i,count+1);
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()%2!=0) {
				result.add(entry.getKey());
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(7);
		System.out.println(removeOddIterationsOfNumbers(list));

	}

}
