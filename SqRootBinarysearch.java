package kunal;

public class SqRootBinarysearch {
public static void main(String[]args) {
	int n=81;
	
	System.out.print(sqrt(n));

}
static int sqrt(int n) {
	int s=0;
	int end= n;
	while(s<=end) {
		int mid=s+(end-s)/2;
		if(mid*mid==n) {
			return mid;
		}
		else if(mid*mid>n) {
			end=mid-1;
		}
		else
			s=mid+1;
	}
	return n;
}
}
