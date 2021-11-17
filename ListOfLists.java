package test2;
import java.util.*;
public class ListOfLists {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		List<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(2);
		List<Integer> c = new ArrayList<Integer>();
		c.add(5);
		c.add(6);
		list.add(a);
		list.add(b);
		list.add(c);
		
		System.out.println(collectFromList(list));

	}

	private static List<Integer> collectFromList(List<List<Integer>> list) {
		List<Integer> result = new ArrayList<Integer>();
		for(List<Integer> l:list) {
			result.addAll(l);
		}
		return result;
	}

}
