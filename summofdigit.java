package kunal;

public class summofdigit {
public static void main(String[]args) {
	System.out.println(Sum(5342));
}
static int Sum(int n) {
	if(n==0) {
		return 0;
	}
	return(n%10)+ Sum(n/10);
}
}

