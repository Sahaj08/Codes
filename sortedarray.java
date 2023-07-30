package practice;

public class sortedarray { 
    public static void main(String[] args) {
        int[]arr= {1,2,3,99,5,6,7,8};
      System.out.println(sorted(arr));
    }
	public static boolean sorted(int[] arr) { 
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i]) {
				return false;
			}
		}
		return true;
	}

}
