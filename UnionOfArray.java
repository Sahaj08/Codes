package practice;

import java.util.*;

public class UnionOfArray {
	public static void main(String[] args) throws Exception{
		int arr1[]= {1,2,3,4,2,3};
		int arr2[]= {3,11,14,5,2,3};
		System.out.print(union(arr1,arr2));
		
	}
	public static int union(int arr1[], int arr2[]) {
		HashSet<Integer> set= new HashSet<Integer>();
		for(int i=0; i<arr1.length; i++) {
			
			set.add(arr1[i]);
		}
		for(int j=0; j<arr2.length; j++) {
			set.add(arr2[j]);
			
		}
		 return 
				 set.size();
	}

}
