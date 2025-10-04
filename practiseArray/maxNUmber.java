package practiseArray;
import java.util.*;
public class maxNUmber {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		max(arr);
		System.out.println(max(arr));
	}
	public static int max(int arr[]) {
		int max_number=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max_number) {
				max_number=arr[i];
			}
		}
		return max_number;
	}
}
