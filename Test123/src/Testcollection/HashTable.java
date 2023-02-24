package Testcollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String[] args)
	{
		// key and value
		Hashtable<Integer,String> s = new Hashtable<Integer,String >();
		
		  //inseration
		s.put(null, "Class");
		s.put(23, "velcoity");
		s.put(45, "Method");
		s.put(null, "VAlUE");
		s.put(25, "Active");
		
		// Retrieval
		for(Map.Entry<Integer,String> p: s.entrySet())
		{
			System.out.println("Key= "+ p.getKey()+ "value = " + p.getValue());
			
		}
		
//		Deletion
	    s.put(null, "testing");
//		
//		System.out.println("=================");
//		for(Map.Entry<Integer,String> s:map.entrySet())
	    
	    
//		{
//			System.out.println("Key= "+ s.getKey()+ "value = " + s.getValue());
//			
//		}
		
	}

}
