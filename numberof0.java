package kunal;

public class numberof0 {
	public static void main(String[]args) {
		System.out.println(total0(108090200));
	}
	static int total0(int n) {
		if(n==0) { 
			return 0;
		}
		if(n%10==0) {
			return 1+total0(n/10);
		}
		else {
			return total0(n/10);
		}
	}
}
