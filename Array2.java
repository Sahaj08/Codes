package practice;


//to calculate aveage of array elements.


public class Array2 {
public static void main(String[]args) {
	float[] marks= {12f,13.5f, 17.5f, 22f};
	float sum=0;
	for(float element: marks) {
		sum=sum+element;
	}
	System.out.println("average= "+sum/marks.length);
}
}
f