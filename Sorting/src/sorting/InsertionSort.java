package sorting;

import java.util.Scanner;
public class InsertionSort{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the length of an array");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the arrray elements");
	int key=0;
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	for(int i=1;i<n;i++) {
			key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	for(int z=0;z<n;z++) {
		System.out.print(arr[z]+", ");
	}
}
}