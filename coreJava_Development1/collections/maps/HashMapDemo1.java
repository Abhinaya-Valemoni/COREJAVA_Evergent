package com.evergent.corejava.collections.maps;
import java.util.Map;
import java.util.HashMap;
public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap mymap=new HashMap();
		mymap.put(100,"Abhi");
		mymap.put("200","Vamshi");
		mymap.put("300","Dhruthi");
		mymap.put(100,"hlo");
		mymap.put(null,"Hii");
		mymap.put(143,null);
		System.out.println(mymap);
		
	}

}
