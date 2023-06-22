//Write a program which accepts days(eg. 670 days) asinteger and display total number
//of years, months and days in it.

package practice;
import java.util.Scanner;
public class assi10 {

	public static void main(String str[]) {
      
		int n,  years,months;
		
		Scanner sc= new Scanner(System.in);
		
		n= sc.nextInt();
		
     	System.out.println("no. of days=  "+n);
     	
     	years= n/365;
     	System.out.println("no. of years=  "+years);
     	
     	months=n/30;
     	System.out.println("no. of months=  "+months);
     	
	}

	


}
