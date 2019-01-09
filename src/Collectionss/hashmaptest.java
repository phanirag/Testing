package Collectionss;

import java.util.IdentityHashMap;

public class hashmaptest {

	public static void main(String[] args) {
		IdentityHashMap<Integer, String> h=new IdentityHashMap<Integer, String>();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		h.put(i1, "hari");
		h.put(i2, "Ram");
		System.out.println(h);
	}
}
