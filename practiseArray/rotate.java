package practiseArray;

import java.lang.reflect.Array;
import java.util.*;

public class rotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		rotate_array(arr, k);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotate_array(int arr[], int k) {
		int n = arr.length;
		k = k % n;
		for (int j = 1; j <= k; j++) {
			int last = arr[n - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = last;
		}
	}
}
