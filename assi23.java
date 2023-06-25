package practice;
//Calculate sum of Lucas series (up to 10 terms) :
//1, 2, 3, 6, 11, 20 ,........
public class assi23 {
	
	public static void main(String str[]) {

	int a=1, b=2, i,c=3,d ;
	System.out.print(a);
	System.out.print("  "+b);
	System.out.print("  "+c);
	for(i=0;i<7;i++)
	{
		d=a+b+c;
		System.out.print("  "+d);

		a=b;
		b=c;
		c=d;
	}

}

}

