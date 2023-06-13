package kunal;

public class BinarysearchREcc {
public static void main(String[]args) {
	int[] arr= {12,13,14,15,16,18};
	int target=16;
	System.out.print(search(arr,target,0, arr.length-1));
}
static int search(int[]arr, int target, int s, int e) {
	if(s>e) {
		return -1;
	}
	int m= s+(e-s)/2;
	if(target==arr[m]) {
		return m;
	}
	if(target< arr[m]) {
		return(search( arr,target,s,m-1));
	}
	return(search(arr,target,m+1,e));
}
}
