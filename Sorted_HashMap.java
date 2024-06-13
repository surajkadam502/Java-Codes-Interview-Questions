package Java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sorted_HashMap {

	public static void main(String[] args) 
	{
         Map<String,String> Unsortedmap = new HashMap<>();
         
         Unsortedmap.put("zahadf", "xadub");
         Unsortedmap.put("Apple", "Sweet");
         Unsortedmap.put("Dog", "cute");
         Unsortedmap.put("Chilli", "Spicy");
       
         for(Map.Entry<String, String> entry : Unsortedmap.entrySet())
         {
        	 System.out.println(entry.getKey());
         }
         System.out.println("");
         
         Map <String, String > treeMap = new TreeMap<String,String>(Unsortedmap);
         for (Map.Entry<String, String> entry : treeMap.entrySet()) 
         {
        	 System.out.println(entry.getKey());
         }
	}

}
