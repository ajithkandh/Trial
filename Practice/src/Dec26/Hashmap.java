package Dec26;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("java", 23);
		hm.put("Rose", 44);
		hm.put("Ponns", 55);
		hm.put("Gary", 66);
		System.out.println("The size is: "+hm.size());
		System.out.println("The ID of java is:"+hm.get("java"));
		System.out.println("The ID of Rose is:"+hm.get("Rose"));
		for(String j:hm.keySet())
		{
			System.out.println("THe Employee name is:"+j);
		}
		for(Integer k:hm.values())
		{
			System.out.println("The employees ID is:"+k);
	
		}

	}

}
