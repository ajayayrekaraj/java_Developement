package Sorting;

import java.util.*;

public class selection_sort_today {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		selecion_sort_asc(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void selecion_sort_asc(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int mini=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[mini]) {
					mini=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
	}
}
