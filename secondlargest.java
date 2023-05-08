package kunal;



public class secondlargest {

	public static void main(String[]args) {
		int i;
		int[]arr= {10,20,30,12,59};
	  int largest=arr[0];
	  int seclargest=-1;
	  
	  for(i=0;i<arr.length;i++) {
		  if (largest<arr[i]) {
			  seclargest=largest;
			  largest=arr[i]; 
			  }
		  else if(arr[i]<largest && arr[i]>seclargest) {
		  seclargest=arr[i]; 
		  }
	
	  }
	  System.out.println("largest= " +largest);
	  System.out.println("secondlargest="+seclargest); 
		
	  
		
	}
}
