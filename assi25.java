package practice;
//Program to show sum and average of 10 element array. Accept array elements from
//user.
import java.util.Scanner;
public class assi25 {
	public static void main(String str[]) {
		int i,sum=0, avg;
		Scanner sc= new Scanner(System.in);
		int a[]=new int[10];
		for(i=0;i<10;i++) {
			System.out.println("value: "+i);
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of array elements=  "+sum);
		avg= sum/10;
		System.out.println("average of arrays=  "+avg);
	}

}
