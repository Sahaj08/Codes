package practice;
import java.util.*;
public class ThreeSum {
public static void main(String[]args) {
	int[]arr= {-1,-1,34,22,17,8,4,2,0,1};
	
	System.out.print(sum(arr));
}
public static ArrayList<Integer>sum(int[]arr){
	
	ArrayList<Integer> ans= new ArrayList<>();
	
	int n=arr.length;
	Arrays.sort(arr);
	for(int i=0; i<n; i++) { 
		
		//skipping suplicates elements for i
		if(i>0 && arr[i]==arr[i-1]) {
			continue;
		}
		
		
        int j = i + 1;
        int k = arr.length - 1;
        
        
        while (j < k) {
            int sum = arr[i] + arr[j] + arr[k];

            if (sum == 0) {
                // Found a triplet with zero sum
            	ans.add(arr[i]);
            	ans.add(arr[j]);
            	ans.add(arr[k]);
            
            	 // Skip duplicate elements for j
                while (j < k && arr[j] == arr[j + 1]) {
                    j++;
                }

                // Skip duplicate elements for k
                while (j < k && arr[k] == arr[k - 1]) {
                    k--;
                }

                // Move the pointers
                j++;
                k--;
                
                
            } else if (sum < 0) {
                // Sum is less than zero, increment j to increase the sum
                j++;
            } else {
                // Sum is greater than zero, decrement k to decrease the sum
                k--; 
            }
        }
	}return ans;
	
}
	}
