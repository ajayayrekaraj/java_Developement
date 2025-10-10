package Sorting;
import java.util.*;
public class selection_sort_DEC {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		selection_DEC(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void selection_DEC(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int max=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>max) {
					max=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
		}
	}
}
