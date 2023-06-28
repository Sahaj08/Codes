package practice;
import java.util.*;

public class KthLargestArray {
	public static void main(String args[]) {
		int[]arr= {1,22,4,65,7,9,10};
		int k=2;
	//	int i=arr.length;
	    for(int i=0; i<arr.length;i++) {
	    	for(int j=i+1; j<arr.length; j++) {
	    		if(arr[i]<arr[j]) {
	    			int temp= arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    			
	    			
	    		}
	    		
	    	
	    		
	    	}
	    	if(i==k-1) {
    			System.out.println(arr[i]);
    		}
	    }
	    System.out.print(Arrays.toString(arr));
	    
	}
	
	
	}
