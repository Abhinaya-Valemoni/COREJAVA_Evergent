package com.evergent.corejava.collections.maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo4 {

	public static void main(String[] args) {
		TreeMap<Integer ,String> mymap=new TreeMap<>();
		mymap.put(100,"Abhi");
		mymap.put(103,"Vamshi");
		mymap.put(102,"null");
		//mymap.put("200","Vamshi");
		//mymap.put("300","Dhruthi");
		mymap.put(100,"hlo");
		//mymap.put(null,"Hii");
		//mymap.put(143,null);
		System.out.println(mymap);
		for(Entry<Integer, String> k: mymap.entrySet()) {
			System.out.println(k);
		}
		
		
	}

}
