package sorting;
//It will work only for continous number from 0 ton or 1 to n  ...... it sort based on index... dont think of this way..
import java.util.*;
public class Cyclicsort {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the arrray elements");// elements must be between 0 to n;
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int i=0;// if array starts from 1
		while(i<n) {
			int temp=0;
			 if(arr[i]!=i+1) {
			 temp=arr[i];
			 arr[i]=arr[temp-1]; // minus 1 for array with 1 and for array start from 0 only temp 
			 arr[temp-1]=temp;
			 }
			 else{
				 i++;
			 }
		}
		System.out.println(Arrays.toString(arr));
	}
}
//the above is sorting based on the index 
// sort using the correct value..i.e)moving arr[0]to correct index...
//  create an variable correct and if the arr[i]!=correct then swap the arr[i]and the correct value .... then 
// if the swapped value is incorrect then swap tat incorrect value to the correct index and move tat index value to arr[0]
// if arr[0]is correct then move to next index......