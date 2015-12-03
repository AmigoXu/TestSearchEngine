package tse.testCases;

import java.util.HashMap;
import java.util.Map;

public class TTTT {
	 
		  
		  public static void main(String[] args) {
		    
		    Map<String, String>  map = new HashMap<String, String>();
		    map.put("id","abc001");
		    map.put("name","kitty cat");
		    
		    for (String key : map.keySet()) {
		      System.out.println("key:"+key+"\tvalue:"+map.get(key));
		    }
		  }
		 
}
