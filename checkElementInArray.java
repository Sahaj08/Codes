package kunal;

public class checkElementInArray {
public static void main(String[]args) {
	int[]arr= {2,4,6,9,12,56,1};
	System.out.println(findindex(arr, 1,0));
}
static int findindex(int[]arr, int target, int index) {
	if(index== arr.length) {
		return -1;
	}
	if(arr[index]== target) {
		return index;
	}
	else {
		return findindex(arr,target,index+1);
	}
}
}
