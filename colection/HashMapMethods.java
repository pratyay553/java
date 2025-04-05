package com.colection;

import java.io.Serial;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		//-----put(key,value) , putIfAbsent(key,value) , putAll(hashmap)-----
		hMap.put(1, "virat");
		hMap.put(2, "Rohit");
		hMap.put(3, "Dhoni");
		hMap.put(4, "Shami");
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(7, "Root");
		hm1.putIfAbsent(8, "Hoog");
		
		System.out.println(hMap);//{1=virat, 2=Rohit, 3=Dhoni, 4=Shami}
		System.out.println(hm1);//{7=Root, 8=Hoog}
		
		hm1.putAll(hMap);
		System.out.println(hm1);//{1=virat, 2=Rohit, 3=Dhoni, 4=Shami, 7=Root, 8=Hoog}
		
		// --------remove(object key) , remove(key , value)-----------------
		
		//hm1 = {1=virat, 2=Rohit, 3=Dhoni, 4=Shami, 7=Root, 8=Hoog}
		hm1.remove(2);
		System.out.println(hm1);//{1=virat, 2=Rohit, 3=Dhoni, 4=Shami}
		
		System.out.println(hm1.remove(1,"hello"));//false
		System.out.println(hm1);//{1=virat, 3=Dhoni, 4=Shami, 7=Root, 8=Hoog}
		
		//System.out.println(hMap.get(2));//

		System.out.println(hMap.remove(3));
		//----------------------iterate using entryset()----------------
//		Set<Map.Entry<Integer, String>> set = hMap.entrySet();
//		Iterator<Map.Entry<Integer, String>> i = set.iterator();
//		while (i.hasNext()) {
//			Map.Entry<Integer, String> mEntry = i.next();
//			System.out.println(mEntry.getKey() +" - "+ mEntry.getValue());
//		}
	}

}
