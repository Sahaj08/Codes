package kunal;
//REMOVING DUPKICATION IN SORTED ARRAY
public class removingDuplication {
public static void main(String[] args) {
	int[] arr= {1,2,2,3,4,4,5,6,6};
	int[] temp= new int[arr.length];
	int j=0;
	for(int i=0; i<arr.length-1;i++) {
		if(arr[i]!=arr[i+1]) {
			temp[j]=arr[i];
			j++;
		}
	}
	temp[j]=arr[arr.length-1];
	for(int x=0; x<temp.length;x++) {
		System.out.print(temp[x]);
	}
	
}
}
