package JavaTraining;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Bye");
		hm.put(2, "GoodBye");
		hm.put(3, "Morning");
		hm.put(4, "Night");
		System.out.println(hm.get(2));
		
		Set sn=hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

			
		}

	}

}
