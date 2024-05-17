package java_collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("Ajith", 200);
		map.put("Vijay", 250);
		map.put("Vikram", 100);
		map.put("Ravi", 70);
		System.out.println(map);
		System.out.println(map.put("Vijay", 300));
		System.out.println(map.put("Kamal", 1000));
		Set<String> s = map.keySet();
		System.out.println(s);
		Collection<Integer> c = map.values();
		System.out.println(c);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		Iterator<Entry<String, Integer>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue().equals(70)) {
				entry.setValue(90);
			}
		}
		System.out.println(map);
	}

}
