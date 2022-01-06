package  collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashSample {

	public  static void main(String ags[])
	{
		System.out.println("\n \n \n");
		//LinkedHashMap<String, String> studentPercent =new LinkedHashMap<String, String>();
		//HashMap<String, String> studentPercent =new HashMap<String, String>();
		//TreeMap<String, String> studentPercent =new TreeMap<String, String>();
		// int = Integer, float = Float, double=Double, boolean=Boolean, char=Character, short=Short, long=Long
		// byte=Byte
	
	//	HashSet<Student> school=new HashSet<Student>();
		
		Hashtable<String, String> studentPercent =new Hashtable<String, String>();
		studentPercent.put("ram", "65");
		studentPercent.put("shyam", "95");
		studentPercent.put("bharat", "35");
		studentPercent.put("shyam", "65");
		
		// get size of hash
		int studentSize=studentPercent.size();
		System.out.println("hash : number of students :"+studentSize);
		
		// remove an items from hash by key
		studentPercent.remove("bharat");
		studentSize=studentPercent.size();
		System.out.println("after removing bharat. hash : number of students :"+studentSize);
		
		// get value by key
		String percent=studentPercent.get("bharat");
		System.out.println("bharat score is "+percent);
		// check if key exists 
		if(studentPercent.containsKey("mike"))
		{
			System.out.println("student mike exists");
		}else
			System.out.println("student mike doesnt exists");

		// check if value exists 
		if(studentPercent.contains("65"))
		{
			System.out.println("student scored 65");
		}
		
		// get all the keys from hashmap 
		Set<String> keySet=studentPercent.keySet();
		for(String key:keySet)	
		{	
			System.out.println(key);
			System.out.println(studentPercent.get(key) );
		}	

		
		
	}
}
