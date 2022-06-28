package javaPackage;

import java.util.HashMap;

public class HashMapPa {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Jan");
		hm.put(2, "Feb");
		hm.put(3, "Mar");
		hm.put(4, "Apr");
		hm.put(5, "May");
		hm.put(6, "June");
		hm.put(7, "July");
		hm.put(8, "Aug");
		hm.put(9, "Sep");
		hm.put(10, "Oct");
		System.out.println(hm.get(3));
		System.out.println(hm.get(2));
		System.out.println(hm);

	}

}
