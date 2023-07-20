package practice;
import java.util.*;
public class LeadedrArray {
public static void main(String[]args) {
	int arr[]= {1,-6,882,44,55,21,3};
	
	System.out.print(leader(arr));
}
public static ArrayList<Integer> leader(int[] arr) {
	  ArrayList<Integer> ans= new ArrayList<>();
	
	int n=arr.length;
	int max=arr[n-1];
	ans.add(arr[n-1]);
	for(int i = n - 2; i >= 0; i--) {
		if(arr[i]>max) {
			 ans.add(arr[i]);
		        max = arr[i];
		      }

		  
		}
	return ans;
	}
}

 