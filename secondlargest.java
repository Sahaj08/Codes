//program to print second largest number from input array
package practice;
import java.util.Scanner;
public class secondlargest {
public static void main(String str[]) {
	int i; int fl; int sl;
Scanner scr= new Scanner(System.in);
int a[]= new int[10];
for(i=0;i<10;i++) {
	System.out.println("value:  "+i);
	a[i]= scr.nextInt();
	}
 fl=a[0];
 sl=a[1];
 for(i=0;i<10;i++) {
	 if(fl<a[i])
	 {
		 sl=fl;
		 fl=a[i];
	 }
	 else
		 if(sl<a[i])
		 {
			 sl=a[i];
		 }
 }
 System.out.println("first largest=  "+fl);
 System.out.print("second largest=  "+sl);
}


}
