package com.evergent.corejava.collections.maps;
import java.util.Map;

import java.util.Hashtable;
public class HashtableDemo2 {

	public static void main(String[] args) {
		Hashtable mymap=new Hashtable();
		mymap.put(100,"Abhi");
		mymap.put(100,"hlo");
		mymap.put("200","Vamshi");
		mymap.put("300","Dhruthi");
		
		//mymap.put(null,"Hii");
		//mymap.put(143,null);
		System.out.println(mymap);
		
	}

}
