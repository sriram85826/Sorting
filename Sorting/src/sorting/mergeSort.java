package sorting;
// not complited
import java.util.Scanner;

public class mergeSort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n=s.nextInt();
		int temp=0;
				int arr[]=new int[n];
		
		System.out.println("Enter the arrray elements");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int start=0;
		int end=n;
		int mid=(start+end)/2;
		//Merger(int arr[],int start,int mid,int end) ;
		
		//splitarray();

	}
		static int[] Merger(int arr[],int start,int mid,int end) {
			//int mid=(start+end)/2;
			int arrleft[]=new int[mid-start+1];
			for(int i=0;i<=mid;i++) {
				arrleft[i]=arr[i];
			}
			int arrright[]=new int[end-mid];
			for(int j=0;j<end;j++) {
				arrleft[j]=arr[mid+1+j];
			}
			int i=0,j=0,k=0;// i point left arr-- j- point rigth array--k -point original array
			while(i<mid-start+1 && j<end-mid) {
				//  left arr index   rightarr index length
				if(arrleft[i]<arrright[j]) {
					arr[k++]=arrleft[i++];//then we have to increament the value 
					//k++; j++; which can be written as short form as arr[k++]
				}
				else {
					arr[k++]=arrright[j++];
				}
			}
			return arr ;
		}
}
//}
//		public static  void mergerSort(int arr[],int start,int end) {
//			if(start<end) {
//				int mid=(start+end)/2;
//				mergerSort(int arr[],int start,int mid);
//				mergerSort(int arr[],int mid+1,int end);
//				merger(int arr[],int start,int mid,int end);
//			}
//			
//			}
//			
//		}
//		
//}
