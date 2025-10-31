package Sorting;

import java.util.*;

public class Insertion_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		insert(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void insert(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int picked = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > picked) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = picked;
		}
	}
}
