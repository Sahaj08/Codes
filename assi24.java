package practice;
import java.util.Scanner;
//Print all prime numbers between two given numbers;
public class assi24 {
  public static void main() {
	  int a,b,n,i,count=0;
	  Scanner x= new Scanner(System.in);
	  System.out.print("firdt number= ");
	  a=x.nextInt();
	  
	  Scanner z= new Scanner(System.in);
	  System.out.print("second number= ");
	  b=z.nextInt();
	  n=0;
	  for(i=a;i<=b;i++);
	  {
		  if(b%i==0)
		  {
			 n= count++;
		  }
		  
		  System.out.print(n);
	  }
	  
  }
}
