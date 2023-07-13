package DSAsheet;

public class twoSum {
 public static void main(String[]args) {
	 int arr[]= {1,4,3,7};
	 int target=11;
	 for(int i=0; i<arr.length; i++) {
		 for(int j=i+1; j<arr.length; j++) {
			 if(arr[i]+arr[j]==target) {
				 System.out.print(i);
				 System.out.print(" "+j);
			 }
		 }
	 }
 }
}
