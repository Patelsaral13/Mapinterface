package mapdemo;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HashMap<Object,String> hm = new HashMap<Object,String>();
		
		hm.put(1, "Saral");
		hm.put(2, "Juli");
		hm.put(3, "shubh");
		hm.put(4, "Juli");
		hm.put(5, "smitesh");
		
		System.out.println(hm);
	
	    System.out.println(hm.get(3));
	    
	    hm.remove(5);
	    
	    System.out.println(hm);
	    
	    System.out.println(hm.containsKey(4));
	    System.out.println(hm.containsKey(8));
	    
	    System.out.println(hm.containsValue("Juli"));
	    
	    System.out.println(hm.isEmpty());
	 
	    System.out.println(hm.clone());
	    
	    System.out.println(hm);
	    
	    System.out.println(hm.keySet());
	    System.out.println(hm.values());
	    System.out.println(hm.entrySet());
	   for(Object i:hm.entrySet())
		   
	   {
		   System.out.println(i);
		   
	   }
	

	}
	

}
