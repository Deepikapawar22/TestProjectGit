package javaPackage;

import java.util.Hashtable;

public class HashTableP {

	public static void main(String[] args) {
		Hashtable<Integer, String> Ht = new Hashtable<Integer, String>();
		
		Ht.put(1, "Jan");
		Ht.put(2,"Feb");
		Ht.put(3,"Mar");
		System.out.println(Ht.get(1));
		System.out.println(Ht.get(2));
		System.out.println(Ht.get(3));
		System.out.println(Ht);

	}

}
