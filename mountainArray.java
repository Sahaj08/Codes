package kunal;

public class mountainArray {

	public static void main(String[]args) {
	int[] arr= {1,2,3,4,5,6,20,18,11};
    int s=0,e=arr.length-1,ans=-1;
    
    while(s<e) {
    	int mid= s+(e-s)/2;
    	if(arr[mid]>arr[mid+1]) {
    		ans=mid;
    		e=mid;
    	}else if(arr[mid]<arr[mid+1]) {
    		ans=mid+1;
    		s=mid+1;
    	}
    	
    }
    System.out.println( ans);
}
}
