package javaPackage;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
		ht.put(1,"Jan");
		ht.put(2,"Feb");
		ht.put(3,"Mar");
		ht.put(4,"April");
		
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get(3));
		System.out.println(ht.get(4));
		System.out.println(ht);
		
	}

}
