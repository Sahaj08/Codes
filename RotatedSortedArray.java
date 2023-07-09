package kunal;

public class RotatedSortedArray {
 public static void main(String[]args) {
	 int[]arr= {3,4,5,10,0,1,2};
	 
	 int target=1;
	  int ans= abc(arr,target);
	 System.out.print(ans);
 }
	 
 static int abc(int[]arr, int target) {
		 int s=0;
		 int e=arr.length-1;
	 
	     while(s<=e) {
		 int mid=s+(e-s)/2;
		 if(arr[mid]==target) 
			 return mid;
		else if(arr[mid]>=arr[s]) {
			 if(target>=arr[s]&& target<=arr[mid]) 
				 e=mid-1;
			else
				s=mid+1;
			 } 
		 else 
		 {
			 if(target>=arr[mid]&& target<=arr[e])
				 s=mid+1;
			 else
				 e=mid-1;
				 
		 }
		 
			 
		 }
	     return -1;
	 
 }
 
}
