package practice;
import java.util.*;
public class hashMap {
	public static void main(String[]args) {
		HashMap<String,Integer>map=new HashMap<>();
		map.put("india", 120);
		map.put("usa", 180);
		map.put("aus", 220);
		System.out.print(map);
		
	//ITERATION IN HASH MAP
		
		
		for(Map.Entry<String,Integer>e: map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
