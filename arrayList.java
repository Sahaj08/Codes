package practice;
import java.util.ArrayList;
import java.util.List;

public class arrayList {
	
	public static void main(String[]args) {
  
	List<Integer> list1= new ArrayList();
	list1.add(4);
	list1.add(5);

	System.out.println(list1);
	
	list1.add(69);
	System.out.println(list1);
	
	//list1.add(index:1, element:96);
	
	List<Integer>newlist= new ArrayList();
	newlist.add(32);
	newlist.add(66);
	
	list1.addAll(newlist);
	System.out.println(list1);
	
	
	list1.set(1, 23);
	System.out.println(list1);
	
	System.out.println(list1.contains(69));
	
	
	for(int i=0; i<list1.size(); i++) {
		System.out.println("elements are "+list1.get(i));
		
	}
}
}
