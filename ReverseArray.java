package DSAsheet;

public class ReverseArray {
public static void main(String[]args) {
	int arr[]= {1,2,3,65,3,5};
//	for(int i=0; i<arr.length; i++) {
//		System.out.print(arr[i]+" ");
//	}
	reverse(arr);
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
static void reverse(int[]arr) {
	int i=0;
	int j= arr.length-1;
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		
		
	}
}
}
