
public class findLargest {
	public static void main(String[]args) {
		int i;
		int[]arr= {10,20,30,12,59};
	  int largest=arr[0];
	  
	  for(i=0;i<arr.length;i++) {
		  if (largest<arr[i])
			  largest=arr[i];
		  
		  }
	  
	  System.out.print(largest);
		
	  }
	  
		
	}

