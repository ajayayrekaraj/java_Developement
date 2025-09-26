package array_Revision;
import java.util.*;
public class max_array {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		max_Number(arr);
		System.out.println(max_Number(arr));
	}
	public static int max_Number(int arr[]) {
		//int max=arr[0];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
