package practice;
import java.util.*;
import java.util.ArrayList;

public class LongestConseqSubarray {
public static void main(String[]args) {
	int[]arr= {1,11,21,1,1,2,23,3,4,98,99,100,101,102,103};
	System.out.print(Subarray(arr));
}
public static ArrayList<Integer> Subarray(int[] arr) {
	  ArrayList<Integer> ans= new ArrayList<>();
	  int smallest = Integer.MIN_VALUE;
	  int count=0;
	  Arrays.sort(arr);
	for(int i=0; i<arr.length; i++) {
		if(arr[i]-1 ==smallest) {
		 ans.add(arr[i]);
		 count++;
		 smallest=arr[i];
		}
		else if(arr[i]-1!=smallest) {
			count=1;
			ans = new ArrayList<>();
			ans.add(arr[i]);
			smallest=arr[i];    
		}
	}return ans;
//	return count;
}
}
