package com.evergent.corejava.collections.maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<String,String> mymap=new HashMap<>();
		//mymap.put(100,"Abhi");
		mymap.put("200","Vamshi");
		mymap.put("300","Dhruthi");
		//mymap.put(100,"hlo");
		mymap.put(null,"Hii");
		//mymap.put(143,null);
		System.out.println(mymap);
		for(String i: mymap.keySet()) {
			System.out.println(i);
		}
		for(Entry<String, String> k: mymap.entrySet()) {
			System.out.println(k);
		}
		
		
	}

}
