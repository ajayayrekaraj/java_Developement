package array_Revision;
import java.util.*;
public class swap {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Swapping(arr,0,1);
	}
	public static void Swapping(int arr[],int i,int j) {
		for(int k=0;k<arr.length;k++) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int m=0;m<arr.length;m++) {
			System.out.print(arr[m]+" ");
		}
	}
}
