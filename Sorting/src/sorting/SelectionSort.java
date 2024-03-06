package sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the arrray elements");
		int temp=0;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int j=0;j<n;j++) {
			int miniindex=j;
			for(int k=j+1;k<n;k++) {
				if(arr[k]<arr[miniindex]) {
					miniindex=k;
				}
			}
			temp=arr[j];
			arr[j]=arr[miniindex];
			arr[miniindex]=temp;
			
		}
		for(int z=0;z<n;z++) {
			System.out.print(arr[z]+", ");
		}
		}
}
