package mapdemo;

import java.util.Hashtable;

public class HashTabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Hashtable ht = new Hashtable();
        
//		Hashtable ht = new Hashtable(intial capacity);
        
//        Hashtable ht = new Hashtable(intial capacity ,Load factor);
        
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	
	    ht.put(1, "Johny");
	    ht.put(2, "Rohny");
	    ht.put(3,"rona");
	  
	    System.out.println(ht);
	
	    System.out.println(ht.get(2));
	    System.out.println(ht.remove(2));
	    System.out.println(ht);
	
	
      System.out.println(ht.containsKey(1));	
      System.out.println(ht.containsValue("Rohny"));
      
      System.out.println(ht.keySet());
      System.out.println(ht.values());
	}

}
