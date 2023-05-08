package kunal;
//left rotaion by two places//

public class leftRotateArray {
public static void main(String[]args) {
	int[] a= {1,2,3,4,5,6,7};
	int[] temp= new int[a.length];
	int i;
	int d=2;; //d is the number of rotaion
	int k=0;
	
	// Storing the n - d elements of array arr[] to the front of temp[]
    
	for(i=d;i<a.length;i++) {
		temp[k]=a[i];
		k++;
		
	}
	 // Storing the first d elements of array arr[] into temp
    for ( i = 0; i < d; i++) {
        temp[k] = a[i];
        k++;
    }
 
    // Copying the elements of temp[] in arr[] to get the final rotated array
    for ( i = 0; i < a.length; i++) {
        a[i] = temp[i];
        System.out.print(a[i]+" ");
    }
    

}

	
}

