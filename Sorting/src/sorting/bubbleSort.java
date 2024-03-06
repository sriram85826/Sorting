package sorting;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the arrray elements");
		int temp=0;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int j=0;j<n-1;j++) {
			for(int k=0;k<n-1;k++) {
				if(arr[k]>arr[k+1]) {
					temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
			for(int z=0;z<n;z++) {
				System.out.print(arr[z]+", ");
			}
		}
	

}
