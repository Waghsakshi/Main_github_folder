package Testcollection;

import java.util.HashMap;
import java.util.Map;

public class TestClassco {
	public static void main(String[] args)
	{
		// key and value
		HashMap<Integer,String> map = new HashMap<Integer,String >();
		
		  //inseration
		map.put(null, "Class");
		map.put(23, "velcoity");
		map.put(45, "Method");
		map.put(null, "VAlUE");
		map.put(25, "Active");
		
		// Retrieval
		for(Map.Entry<Integer,String> s:map.entrySet())
		{
			System.out.println("Key= "+ s.getKey()+ "value = " + s.getValue());
			
		}
		
//		Deletion
	    map.put(null, "testing");
//		
//		System.out.println("=================");
//		for(Map.Entry<Integer,String> s:map.entrySet())
	    
	    
//		{
//			System.out.println("Key= "+ s.getKey()+ "value = " + s.getValue());
//			
//		}
		
	}

}
